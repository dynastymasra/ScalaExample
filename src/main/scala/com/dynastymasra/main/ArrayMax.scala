package com.dynastymasra.main

import scala.annotation.tailrec

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
object ArrayMax {
  // http://khannedy.com/2014/11/08/scala-menemukan-nilai-maksimum-di-array/#more-5645

  def searchMaxArrayByLoop(array: Array[Int]) {
    var temp = 0
    for (i <- 0 until array.length) {
      if (temp < array(i)) {
        temp = array(i)
      }
    }
    println(s"Max value array for = ${temp}")
  }

  def searchByRecursive(array: Array[Int]) = {

    @tailrec
    def searchRecursive(max: Int, index: Int): Int = {
      if (index >= array.length) max
      else if (max < array(index)) searchRecursive(array(index), index + 1)
      else searchRecursive(max, index + 1)
    }

    println(s"Max value array rec = ${searchRecursive(0, 0)}")
  }

  def main(args: Array[String]) {
    val array = Array(6, 5, 4, 543, 45, 5, 5, 7, 4, 3, 5, 6, 45, 64, 56, 54, 75, 7, 6, 76, 8, 678, 5, 56, 634, 645, 7, 658, 56, 8, 456, 436, 34, 34, 5, 4, 54, 6, 5, 6, 7, 4, 6, 46, 6,
      57, 6, 6, 54, 745, 745, 999, 765, 8, 43, 3, 35, 46, 57, 5, 75, 6, 464, 64, 65, 1000)

    searchMaxArrayByLoop(array)
    searchByRecursive(array)
  }
}
