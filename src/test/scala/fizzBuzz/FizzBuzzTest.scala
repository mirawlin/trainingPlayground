package fizzBuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest extends FlatSpec with Matchers {

  "The function run" should "return fizz when the number is divisible by 3" in {
    val num0 = -3
    val num1 = 9

    val fizzbuzz = new FizzBuzz

    val result0 = fizzbuzz.run(num0)
    val result1 = fizzbuzz.run(num1)

    result0 shouldEqual "fizz"
    result1 shouldEqual "fizz"

  }

  "The function run" should "return buzz when the number is divisible by 5" in {
    val num0 = 5
    val num1 = 10

    val something = new FizzBuzz

    val res0 = something.run(num0)
    val res1 = something.run(num1)

    res0 shouldEqual "buzz"
    res1 shouldEqual "buzz"

  }

  "The function run" should "return fizzbuzz when the number is divisible by 15" in {
    val int0 = 15
    val int1 = 30

    val fizzy = new FizzBuzz

    val res0 = fizzy.run(int0)
    val res1 = fizzy.run(int1)

    res0 shouldEqual "fizzbuzz"
    res1 shouldEqual "fizzbuzz"
  }

  "The function run" should "return the same number if none of the above requirements are met" in {
    val v1 = 8
    val v2 = 13

    val fin = new FizzBuzz

    val res1 = fin.run(v1)
    val res2 = fin.run(v2)

    res1 shouldEqual "8"
    res2 shouldEqual "13"
  }
}
