package com.dynastymasra.main

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
case class UserOptional(id: Int, firstName: String, midName: String, lastName: String, age: Int, gender: Option[String])

object UserRepository {
  val user = Map(1 -> UserOptional(1, "Dimas", "Ragil", "T", 22, Some("Male")), 2 -> UserOptional(2, "Coba", "Test", "Baru", 22, None))
  def findById(id: Int): Option[UserOptional] = user.get(id)
  def findAll = user.values
}

object MainOptional {
  def main(args: Array[String]) {
    val user = UserRepository.findById(1)
    if (user.isDefined) {
      println(user.get.firstName)
    }
    val user1 = UserOptional(2, "Coba", "Test", "Baru", 21, None)
    val gender = user1.gender match {
      case Some(gender) => gender
      case None => "not specified"
    }
    println("Gender: " + gender)

    UserRepository.findById(2).foreach(item => println(item.firstName))
    println(UserRepository.findById(1).map(_.age))
    println(UserRepository.findById(1).map(_.gender))
  }
}