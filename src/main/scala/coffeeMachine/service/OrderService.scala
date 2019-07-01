package coffeeMachine.service

import coffeeMachine.model._

object OrderService {

  def isOrderValid(drink: Drink, amount: BigDecimal): Drink = {

    drink match {
      case Tea(_, _, _) if amount < 0.4 =>
        amountMissingMessage(BigDecimal.valueOf(0.4), amount)
      case Coffee(_, _, _) if amount < 0.6 =>
        amountMissingMessage(BigDecimal.valueOf(0.6), amount)
      case Chocolate(_, _, _) if amount < 0.5 =>
        amountMissingMessage(BigDecimal.valueOf(0.5), amount)
      case Orange() if amount < 0.6 =>
        amountMissingMessage(BigDecimal.valueOf(0.6), amount)
      case _ => drink
    }
  }

  private def amountMissingMessage(priceOfDrink: BigDecimal, amountPaid: BigDecimal) = {
    val missing = priceOfDrink - amountPaid
    Comment(s"""your order is missing $missing""")
  }
}
