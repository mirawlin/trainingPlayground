package coffeeMachine

import coffeeMachine.model.{Coffee, Orange}
import org.scalatest.{Matchers, WordSpec}

class InMemoryDrinkHistoryRepositoryTest extends WordSpec with Matchers {
  "addDrinks" should {
    "add drinks to the list" in {
      val drinkRepository = InMemoryDrinkHistoryRepository.getRepository()
      val drink1 = Orange()
      val drink2 = Coffee(0)

      drinkRepository.addDrink(drink1)
      drinkRepository.addDrink(drink2)

      // THEN
      drinkRepository.getDrinks().size shouldEqual 2
    }
  }
}
