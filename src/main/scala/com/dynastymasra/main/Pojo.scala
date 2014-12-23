package com.dynastymasra.main

import scala.io.StdIn

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
class Pojo(var _first: String, var _mid: String, var _last: String) {
  def first = _first
  def first_= (value: String): Unit = {
    _first = value
  }

  def mid = _mid
  def mid_= (value: String): Unit = {
    _mid = value
  }

  def last = _last
  def last_= (value: String): Unit = {
    _last = value
  }
}

object MainPojo {
  def main(args: Array[String]) {
    println("Konstruktor")
    print("Masukan nama depan:")
    val first = StdIn.readLine()
    print("Masukan nama tengah:")
    val mid = StdIn.readLine()
    print("Masukan nama belakang:")
    val last =StdIn.readLine()
    val p = new Pojo(first, mid, last)
    println(s"Nama anda: ${p.first} ${p.mid} ${p.last}")

    println("Getter & Setter")
    print("Masukan nama depan baru:")
    val newFirst = StdIn.readLine()
    p.first = newFirst
    print("Masukan nama tengah baru:")
    val newMid = StdIn.readLine()
    p.mid = newMid
    print("Masukan nama belakang baru:")
    val newLast = StdIn.readLine()
    p.last = newLast
    print(s"Nama baru anda:${p.first} ${p.mid} ${p.last}")
  }
}
