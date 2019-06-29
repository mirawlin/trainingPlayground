package coffeeMachine

import coffeeMachine.model._
import coffeeMachine.service.OrderService

object DrinkMaker {

  def makeDrink(order: Order): Drink = {
    val drink = Drink.getDrink(order.order)

    OrderService.isOrderValid(drink, order.amount)
  }
}
