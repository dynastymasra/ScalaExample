package com.dynastymasra.main

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
class ReadingScreen {
  def readingConsole(): Unit = {
    print("Input your data:")
    val line = StdIn.readLine()
    println("Is your data " + line)
  }

  def writeFile(): Unit = {
    print("Write text in File:")
    val line = StdIn.readLine()
    val writer = new PrintWriter(new File("test.txt"))
    writer.write(line)
    writer.close()

    println("reading file")
    Source.fromFile("test.txt").foreach(print)
  }
}

object MainReading {
  def main(args: Array[String]) {
    val read = new ReadingScreen()
    read.readingConsole()
    read.writeFile()
  }
}
