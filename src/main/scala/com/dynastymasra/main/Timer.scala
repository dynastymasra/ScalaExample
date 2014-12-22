package com.dynastymasra.main

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
object Timer {
  def onePerSecond(callback: () => Unit) {
    while(true) {
      callback()
      Thread sleep 1000
    }
  }

  def timeFlies() {
    println("time thread")
  }

  def main(args: Array[String]) {
    onePerSecond(timeFlies)
  }
}
