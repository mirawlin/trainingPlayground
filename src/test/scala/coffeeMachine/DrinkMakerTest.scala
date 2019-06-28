package coffeeMachine

import coffeeMachine.model._
import org.scalatest.{Matchers, WordSpec}

class DrinkMakerTest extends WordSpec with Matchers {

  "the function orders" should {
    "return a Tea if the first letter in the string is T and no stick if no sugars" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("T::", 0))

      //THEN
      result.isInstanceOf[Tea] shouldBe true
      // SAME SAME
      result match {
        case Tea(_, false) => succeed
        case _ => fail("WRONG TYPE")
      }
    }

    "return a Coffee if the first letter in the string is C and no stick if no sugars" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("C::",0))

      //THEN
      result.isInstanceOf[Coffee] shouldBe true
    }


    "return a Chocolate if the first letter in the string is H and no stick if no sugars" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("H::",0))

      //THEN
      result.isInstanceOf[Chocolate] shouldBe true
    }

    "return the message received if it starts with an M" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("M:message",0))

      //THEN
      result.isInstanceOf[Comment] shouldBe true
      result match {
        case Comment(msg) =>
          msg shouldEqual "message"
        case _ => fail()
      }
    }


    "return a Tea if the first letter in the string is T and te sugars associated to it" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("T:1:0",0))

      //THEN
      result match {
        case Tea(1, true) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
    "return a Coffee if the first letter in the string is C and the sugars associated to it" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("C:2:0",0))

      //THEN
      result match {
        case Coffee(2, true) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
    "return a Hot Chocolate if the first letter in the string is H and the sugars associated to it" in {
      //WHEN
      val result = DrinkMaker.makeDrink(Order("H:2:0",0))

      //THEN
      result match {
        case Chocolate(2, true) => succeed
        case _ => fail("WRONG TYPE")
      }
    }

  }
}
