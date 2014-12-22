package com.dynastymasra.main

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
class ForEachFor {
  //http://khannedy.com/2013/08/31/perulangan-for-dan-foreach-di-scala/#more-5358
  def testForEach(): Unit = {
    println("Test for each in scala")
    val data = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    data.foreach(item => println(item))
  }

  def testFor(): Unit = {
    println("Test for in scala")
    val data = List(1, "Dimas", 2, "Ragil", 3, "T")
    for (item <- data) {
      println(item)
    }
  }
}

object Main {
  def main(args: Array[String]) {
    val test = new ForEachFor()
    test.testForEach()
    test.testFor()
  }
}
