package com.dynastymasra.main

import java.util.Date

import scala.util.Random

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
class Matching {
  //http://khannedy.com/2013/12/22/eksplorasi-pattern-matching-di-scala/#more-5453
  def simpleMatch(): Unit = {
    println("Simple Match")
    val data = List(true, false, "Dimas", "Ragil", "T")
    for (item <- data) {
      item match {
        case true => println("Boolean true")
        case false => println("boolean false")
        case _ => println("else")
      }
    }
  }

  def randomMatch(): Unit = {
    println("Random Match")
    val random = new Random().nextInt(10)
    random match {
      case 10 => println(s"value random = ${random}")
      case other => println(s"value random = ${random}")
    }
  }

  def dataMatch(): Unit = {
    println("Data match")
    val data = List(1, 2, 3, "Dimas", "Ragil", "T", true, false, 'Male, new Date)
    for (value <- data) {
      value match {
        case i: Int => println(i + " is Integer")
        case s: String => println(s + " is String")
        case b: Boolean => println(b + " is Boolean")
        case sym: Symbol => println(sym + " is Symbol")
        case other => println(other + " is " + other.getClass.getName)
      }
    }
  }
}

object MainMatch {
  def main(args: Array[String]) {
    val matching = new Matching()
    matching.dataMatch()
    matching.randomMatch()
    matching.simpleMatch()
  }
}
