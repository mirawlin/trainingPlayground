package coffeeMachine

import coffeeMachine.model._
import org.scalatest.{Matchers, WordSpec}

class DrinkMakerTest extends WordSpec with Matchers {

  "the function orders" should {
    "return a Tea if the first letter in the string is T and no stick if no sugars" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("T::", 0.5))

      //THEN
      result.isInstanceOf[Tea] shouldBe true
      // SAME SAME
      result match {
        case Tea(_, false, false) => succeed
        case _ => fail("WRONG TYPE")
      }
    }

    "return an error message when the money amount is too low" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("T::", 0.3))

      //THEN
      // SAME SAME
      result match {
        case Comment(msg) =>
          msg shouldEqual "your order is missing 0.1"
          succeed
        case _ => fail("WRONG TYPE")
      }
    }

    "return a Coffee if the first letter in the string is C and no stick if no sugars" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("C::", 0.7))

      //THEN
      result.isInstanceOf[Coffee] shouldBe true
    }

    "return an error message when the money amount is too low for coffee" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("C::", 0.3))

      //THEN
      // SAME SAME
      result match {
        case Comment(msg) =>
          msg shouldEqual "your order is missing 0.3"
          succeed
        case _ => fail("WRONG TYPE")
      }
    }

    "return a Chocolate if the first letter in the string is H and no stick if no sugars" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("H::", 0.5))

      //THEN
      result.isInstanceOf[Chocolate] shouldBe true
    }

    "return an error message when the money amount is too low for chocolate" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("H::", 0.3))

      //THEN
      // SAME SAME
      result match {
        case Comment(msg) =>
          msg shouldEqual "your order is missing 0.2"
          succeed
        case _ => fail("WRONG TYPE")
      }
    }

    "return a orange juce if the first letter in the string is O and the correct amount provided" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("O::", 0.6))

      //THEN
      result.isInstanceOf[Orange] shouldBe true
    }

    "return an error message when the money amount is too low for Orange Juice" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("O::", 0.3))

      //THEN
      // SAME SAME
      result match {
        case Comment(msg) =>
          msg shouldEqual "your order is missing 0.3"
          succeed
        case _ => fail("WRONG TYPE")
      }
    }


    "return the message received if it starts with an M" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("M:message", 0))

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
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("T:1:0", 0.4))

      //THEN
      result match {
        case Tea(1, true, false) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
    "return a Coffee if the first letter in the string is C and the sugars associated to it" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("C:2:0", 0.6))

      //THEN
      result match {
        case Coffee(2, true, false) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
    "return a Hot Chocolate if the first letter in the string is H and the sugars associated to it" in {
      //WHEN
      val drinkMaker = new DrinkMaker()
      val result = drinkMaker.makeDrink(Order("H:2:0", 0.5))

      drinkMaker.printDrinkHistory()
      //THEN
      result match {
        case Chocolate(2, true, false) => succeed
        case _ => fail("WRONG TYPE")
      }
    }
  }
}
