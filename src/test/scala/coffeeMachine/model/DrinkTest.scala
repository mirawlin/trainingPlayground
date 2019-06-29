package coffeeMachine.model

import org.scalatest.{Matchers, WordSpec}

class DrinkTest extends WordSpec with Matchers {

  "the function orders" should {
    "return a Tea if the first letter in the string is T and no stick if no sugars" in {
      //WHEN
      val result = Drink.getDrink("T::")

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
      val result = Drink.getDrink("C::")

      //THEN
      result.isInstanceOf[Coffee] shouldBe true
    }

    "return a Chocolate if the first letter in the string is H and no stick if no sugars" in {
      //WHEN
      val result = Drink.getDrink("H::")

      //THEN
      result.isInstanceOf[Chocolate] shouldBe true
    }


    "return the message received if it starts with an M" in {
      //WHEN
      val result = Drink.getDrink("M:message")

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
      val result = Drink.getDrink("T:1:0")

      //THEN
      result match {
        case Tea(1, true) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
    "return a Coffee if the first letter in the string is C and the sugars associated to it" in {
      //WHEN
      val result = Drink.getDrink("C:2:0")

      //THEN
      result match {
        case Coffee(2, true) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
    "return a Hot Chocolate if the first letter in the string is H and the sugars associated to it" in {
      //WHEN
      val result = Drink.getDrink("H:2:0")

      //THEN
      result match {
        case Chocolate(2, true) => succeed
        case _ => fail("WRONG TYPE")
      }
    }

  }

}
