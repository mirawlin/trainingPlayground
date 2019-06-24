package coffeeMachine

trait Drink

case class Coffee(sugar: Int, stick: Boolean = false) extends Drink

case class Tea(sugar: Int, stick: Boolean = false) extends Drink

case class Chocolate(sugar: Int, stick: Boolean = false) extends Drink

case class Comment(msg: String) extends Drink

object DrinkMaker {

  def orders(drink: String): Drink = {
    if (drink.startsWith("T")) {
      val (sugars: Int, stick: Boolean) = getSugarsAndSticks(drink)
      Tea(sugars, stick)
    }
    else if (drink.startsWith("C")) {
      val (sugars: Int, stick: Boolean) = getSugarsAndSticks(drink)
      Coffee(sugars, stick)
    }
    else if (drink.startsWith("H")) {
      val (sugars: Int, stick: Boolean) = getSugarsAndSticks(drink)
      Chocolate(sugars, stick)
    }
    else {
      val sequence = drink.split(":")
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
