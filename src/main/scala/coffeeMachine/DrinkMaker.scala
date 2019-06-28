package coffeeMachine

import coffeeMachine.model._


// Factory design pattern
object DrinkMaker {

  def makeDrink(order: Order): Drink = {

    if (order.order.startsWith("T")) {
      val (sugars: Int, stick: Boolean) = getSugarsAndSticks(order.order)
      Tea(sugars, stick)
    }
    else if (order.order.startsWith("C")) {
      val (sugars: Int, stick: Boolean) = getSugarsAndSticks(order.order)
      Coffee(sugars, stick)
    }
    else if (order.order.startsWith("H")) {
      val (sugars: Int, stick: Boolean) = getSugarsAndSticks(order.order)
      Chocolate(sugars, stick)
    }
    else {
      val sequence = order.order.split(":")
      val message = if (sequence.length > 1)
        sequence(1)
      else null
      Comment(message)
    }
  }

  private def getSugarsAndSticks(drink: String) = {
    val sequence = drink.split(":")
    val sugars = if (sequence.length > 1) sequence(1).toInt else 0
    val stick = if (sugars > 0) true else false
    (sugars, stick)
  }
}
