package coffeeMachine

import coffeeMachine.model.Drink

object InMemoryDrinkHistoryRepository {

  var repository: InMemoryDrinkHistoryRepository = _

  def getRepository(): InMemoryDrinkHistoryRepository = {
    if (repository == null) {
      repository = new InMemoryDrinkHistoryRepository()
      repository
    }
    else repository
  }
}

class InMemoryDrinkHistoryRepository {
  private var drinkHistory: List[Drink] = List.empty

  def addDrink(drink: Drink): Unit = drinkHistory = drinkHistory ++: List(drink)

  def getDrinks(): List[Drink] = drinkHistory
}

