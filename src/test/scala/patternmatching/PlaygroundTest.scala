package patternmatching

import org.scalatest.{FlatSpec, Matchers, WordSpec}

class PlaygroundTest extends WordSpec with Matchers {

  "the fucntion multiplyBy" should {
    "multiply a number by nothing if multplier is equal to 0" in {
      // GIVEN
      val myNb = Option.apply(5)
      val multiplier = 0

      // WHEN
      val result = Playground.multiplyBy(myNb, multiplier)

      // THEN
      result shouldEqual 5
    }
    "multiply a number by another number" in {
      // GIVEN
      val myNb = Option.apply(5)
      val multiplier = 2

      // WHEN
      val result = Playground.multiplyBy(myNb, multiplier)

      // THEN
      result shouldEqual 10
    }
    "return 0 when myNb is null" in {
      // GIVEN
      val myNb = None
      val multiplier = 2

      // WHEN
      val result = Playground.multiplyBy(myNb, multiplier)

      // THEN
      result shouldEqual 0
    }
  }

  "the fucntion multiis plyBy2" should {
    "return 0 when nb is null" in {
      // GIVEN
      val myNb = None

      // WHEN
      val result = Playground.multiplyByTwoIfExists(myNb)

      // THEN
      result shouldEqual 0
    }
    "return the proper result otherqwise" in {
      // GIVEN
      val myNb = Option.apply(5)

      // WHEN
//      val result = Playground.multiplyByTwoIfExists(myNb)
      Playground.goToTheBroomRoom()
      // THEN
//      result shouldEqual 10
    }
  }
}
