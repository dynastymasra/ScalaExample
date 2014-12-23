package com.dynastymasra.main

import java.io.FileNotFoundException
import java.net.{MalformedURLException, URL}

import scala.io.{Source, StdIn}
import scala.util.{Failure, Success, Try}

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
case class CustomerHandling(age: Int)
class CigarettesHandling
case class UnderAgeExeptionHandling(message: String) extends Exception(message)

object MainHandling {
  def buyCigarettesHandling(customerHandling: CustomerHandling): CigarettesHandling =
  if (customerHandling.age < 17)
    throw UnderAgeExeptionHandling(s"Under Age to Buy Cigarettes ${customerHandling.age}")
  else new CigarettesHandling

  def parseUrl(url: String): Try[URL] = Try(new URL(url))
  def parseHttpUrl(url: String) = parseUrl(url).filter(_.getProtocol == "http")

  def getUrlContent(url: String): Try[Iterator[String]] =
    for {
      url <- parseUrl(url)
      connection <- Try(url.openConnection())
      is <- Try(connection.getInputStream)
      source = Source.fromInputStream(is)
    } yield source.getLines()

  def main(args: Array[String]) {
    val young = CustomerHandling(15)
    try {
      buyCigarettesHandling(young)
      println("Buy cigarettes")
    } catch {
      case UnderAgeExeptionHandling(msg) => println(msg)
    }

    val url = parseUrl(StdIn.readLine("URL:")) getOrElse new URL("https://www.google.com")
    println(url)

    println(parseUrl("https://www.google.com").map(_.getProtocol))
    println(parseHttpUrl("http://www.google.com"))
    println(parseHttpUrl("ftp://www.google.com"))
    parseHttpUrl("http://dynastymasra.wordpress.com").foreach(println)

    getUrlContent("https://dynastymasra.wordpress.com") match {
      case Success(lines) => lines.foreach(println)
      case Failure(ex) => println(s"Problem rendering URL content: ${ex.getMessage}")
    }

    val content = getUrlContent("garbage") recover {
      case e: FileNotFoundException => println(Iterator("Request page does not exist") + s"${e}")
      case e: MalformedURLException => println(Iterator("Please enter valid URL") + s"${e}")
      case _ => println(Iterator("An unexpected error"))
    }
  }
}

