package com.dynastymasra.main

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
trait Traits {
  def message: String
  def fly() = println(message)
  def swim: String
  def water() = println(swim)
}

class Duck extends Traits {
  val message = "Iam a Duck"
  val swim = "I can swim"
}

class Pigeon extends Traits {
  val message = "Iam a Pigeon"
  val swim = "I cant swim"
}

object MainTrait {
  def main(args: Array[String]) {
    val bird = List(new Duck, new Pigeon)
    bird.foreach(bird => bird.fly() + "" + bird.water())
  }
}
