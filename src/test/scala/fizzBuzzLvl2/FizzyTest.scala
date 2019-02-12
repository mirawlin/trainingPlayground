package fizzBuzzLvl2

import org.scalatest.{Matchers, WordSpec}

class FizzyTest extends WordSpec with Matchers {

  "the function getNumber" should {
    "return Fizz if the number is divisible by 3" in {
      val num = 6
      val num2 = 12

      val fizzy = new Fizzy

      val result = fizzy.getNumber(num)
      val result2 = fizzy.getNumber(num2)

      result shouldEqual "fizz"
      result2 shouldEqual "fizz"
    }

    "return buzz if the number is divisible by 5" in {
      val num = 10
      val num2 = 25

      val fizzy = new Fizzy

      val result = fizzy.getNumber(num)
      val result2 = fizzy.getNumber(num2)

      result shouldEqual "buzz"
      result2 shouldEqual "buzz"
    }

    "return fizzbuzz if the number is divisible by 15" in {
      val num = 15
      val num2 = 30

      val fizzy = new Fizzy

      val result = fizzy.getNumber(num)
      val result2 = fizzy.getNumber(num2)

      result shouldEqual "fizzbuzz"
      result2 shouldEqual "fizzbuzz"
    }

    "returns the same number if not divisible by 3, 5 or 15" in {
      val num = 2
      val num2 = 8

      val fizzy = new Fizzy

      val result = fizzy.getNumber(num)
      val result2 = fizzy.getNumber(num2)

      result shouldEqual "2"
      result2 shouldEqual "8"
    }

    "prints fizz if the number contains a 3" in
    {
      val num = 31
      val num2 = 23

      val fizzy = new Fizzy

      val result = fizzy.getNumber(num)
      val result2 = fizzy.getNumber(num2)

      result shouldEqual "fizz"
      result2 shouldEqual "fizz"
    }

    "prints buzz if the number contains a 5" in
      {
        val num = 52
        val num2 = 58

        val fizzy = new Fizzy

        val result = fizzy.getNumber(num)
        val result2 = fizzy.getNumber(num2)

        result shouldEqual "buzz"
        result2 shouldEqual "buzz"
      }
  }
}
