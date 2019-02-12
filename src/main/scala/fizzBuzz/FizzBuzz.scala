package fizzBuzz

import fizzBuzz.Test._



class FizzBuzz {

  def run(int: Int): String = {
    if (int % 15 == 0)
      "fizzbuzz"
    else if (int % 3 == 0)
      "fizz"
    else if (int % 5 == 0)
      "buzz"
    else
      int.toString
  }

  def fn(d: Double): Unit = {
    val x: Int = d

    //Prints 20
    println(x)
  }
}

object Test {
  implicit def doubleToInt(d: Double): Int = d.toInt
}


