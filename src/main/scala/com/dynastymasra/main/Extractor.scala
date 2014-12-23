package com.dynastymasra.main

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
trait User {
  def name: String
  def score: Int
}

class FreeUser(val name: String, val score: Int, val upgrade: Double) extends User
class PremiumUser(val name: String, val score: Int) extends User

object FreeUser {
  def unApply(user: FreeUser): Option[(String, Int, Double)] = Some(user.name, user.score, user.upgrade)
}

object PremiumUser {
  def unApply(user: PremiumUser): Option[(String, Int)] = Some(user.name, user.score)
}

object MainExtractor {
  def main(args: Array[String]) {
    println(FreeUser.unApply(new FreeUser("Dimas", 10, 10.0)))
  }
}

