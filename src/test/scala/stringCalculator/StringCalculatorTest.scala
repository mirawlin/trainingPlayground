package stringCalculator

import org.scalatest.{Matchers, WordSpec}

class StringCalculatorTest extends WordSpec with Matchers {
  "split function" should {
    "return the string as is if no delimiters" in {
      // WHEN
      val result = "blabla".split("-")

      result(0) shouldEqual "blabla"
    }
    "return the string splitted if delimiters" in {
      // WHEN
      val result = "bla-blah".split("-")

      result(0) shouldEqual "bla"
      result(1) shouldEqual "blah"
    }
  }
  "function add" should {
    "return 0 if empty string passed to it" in {
      // WHEN
      val result = StringCalculator.add("")

      // THEN
      result shouldEqual 0
    }

    "return the number when one string is passed" in {
      val result = StringCalculator.add("2")

      // THEN
      result shouldEqual 2
    }

    "return the sum of the 2 numbers when there are 2 numbers in the string" in {
      val result = StringCalculator.add("2,1")

      // THEN
      result shouldEqual 3
    }

    "return the sum of numbers when there are multiple numbers in the string" in {
      val result = StringCalculator.add("2,1,5,0")

      // THEN
      result shouldEqual 8
    }
  }
}
