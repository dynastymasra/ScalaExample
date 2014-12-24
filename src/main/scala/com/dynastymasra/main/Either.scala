package com.dynastymasra.main

import java.net.URL

import scala.io.Source

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
object MainEither {
  def getContentEither(url: URL): Either[String, Source] =
    if (url.getHost.contains("google")) Left("Request url is blocked")
    else Right (Source.fromURL(url))

  def main(args: Array[String]) {
    val url1 = new URL("https://www.google.com")
    val url2 = new URL("https://dynastymasra.wordpress.com")
    println(getContentEither(url1))
    println(getContentEither(url2))

    getContentEither(url1) match {
      case Left(msg) => println(msg)
      case Right(source) => source.getLines.foreach(println)
    }

    val content: Either[String, Iterator[String]] = getContentEither(url2).right.map(_.getLines())
    println(content)
    val moreContent: Either[String, Iterator[String]] = getContentEither(url1).right.map(_.getLines())
    println(moreContent)

    val contentAgain: Either[Iterator[String], Source] = getContentEither(url2).left.map(Iterator(_))
    println(contentAgain)
    val moreContentAgain: Either[Iterator[String], Source] = getContentEither(url1).left.map(Iterator(_))
    println(moreContentAgain)

    val contentFlat = getContentEither(url1).right.map(a => getContentEither(url2).right.map(b => (a.getLines().size + b.getLines().size) / 2))
    println(contentFlat)
  }
}

