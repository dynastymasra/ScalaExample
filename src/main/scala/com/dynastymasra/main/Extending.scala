package com.dynastymasra.main

/**
 * Author   : @dynastymasra
 * User     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
class Extending(val xc: Int, val yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("Point x location : " + x);
    println("Point y location : " + y);

  }
}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Extending(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location : " + x);
    println("Point y location : " + y);
    println("Point z location : " + z);
  }
}

object MainExtending {
  //http://www.tutorialspoint.com/scala/scala_classes_objects.htm
  def main(args: Array[String]) {
    println("Extending")
    val main = new Location(10, 15, 20);
    main.move(10, 10)
    main.move(25, 30, 35)

    val singleton = new Extending(10, 20)
    printSingle

    def printSingle: Unit = {
      println("Singleton")
      println(s"Point x = ${singleton.x}")
      println(s"Point y = ${singleton.y}")
    }
  }
}
