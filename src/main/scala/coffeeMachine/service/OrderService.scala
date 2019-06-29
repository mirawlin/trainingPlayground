package coffeeMachine.service

import coffeeMachine.model._

object OrderService {

  def isOrderValid(drink: Drink, amount: BigDecimal): Drink = {

    drink match {
      case Tea(_, _) if amount < 0.4 =>
        val missing = BigDecimal.valueOf(0.4) - amount
        Comment(s"""your order is missing $missing""")
      case Coffee(_, _) if amount < 0.6 =>
        val missing = BigDecimal.valueOf(0.6) - amount
        Comment(s"""your order is missing $missing""")
      case Chocolate(_, _) if amount < 0.5 =>
        val missing = BigDecimal.valueOf(0.5) - amount
        Comment(s"""your order is missing $missing""")
      case _ => drink
    }
  }
}
