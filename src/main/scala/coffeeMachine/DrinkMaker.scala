package coffeeMachine


import coffeeMachine.model._
import coffeeMachine.service.OrderService

class DrinkMaker {

  val repository = InMemoryDrinkHistoryRepository.getRepository()

  def makeDrink(order: Order): Drink = {
    val drink = Drink.getDrink(order.order)

    val result = OrderService.isOrderValid(drink, order.amount)

    result match {
      case Comment(_) => ()
      case x => repository.addDrink(x)
    }
    result
  }

  def printDrinkHistory() = println(repository.getDrinks().toString())
}
