package coffeeMachine.model

trait Drink

case class Coffee(sugar: Int, stick: Boolean = false, extraHot: Boolean = false) extends Drink

case class Tea(sugar: Int, stick: Boolean = false, extraHot: Boolean = false) extends Drink

case class Chocolate(sugar: Int, stick: Boolean = false, extraHot: Boolean = false) extends Drink

case class Comment(msg: String) extends Drink

case class Orange() extends Drink

object Drink {

  def getDrink(order: String): Drink = {

    val temp = 0
    val orderType = order.split(":")
    orderType(0) match {
      case "T" =>
        val (sugars: Int, stick: Boolean) = getSugarsAndSticks(orderType)
        Tea(sugars, stick)
      case "C" =>
        val (sugars: Int, stick: Boolean) = getSugarsAndSticks(orderType)
        Coffee(sugars, stick)
      case "H" =>
        val (sugars: Int, stick: Boolean) = getSugarsAndSticks(orderType)
        Chocolate(sugars, stick)
      case "Th" =>
        val (sugars: Int, stick: Boolean) = getSugarsAndSticks(orderType)
        Tea(sugars, stick, extraHot = true)
      case "Ch" =>
        val (sugars: Int, stick: Boolean) = getSugarsAndSticks(orderType)
        Coffee(sugars, stick, extraHot = true)
      case "Hh" =>
        val (sugars: Int, stick: Boolean) = getSugarsAndSticks(orderType)
        Chocolate(sugars, stick, extraHot = true)
      case "O" =>
        Orange()
      case _ =>
        val message = if (orderType.length > 1)
          orderType(1)
        else null
        Comment(message)
    }
  }

  private def getSugarsAndSticks(sequence: Array[String]) = {
    val sugars = if (sequence.length > 1) sequence(1).toInt else 0
    val stick = if (sugars > 0) true else false
    (sugars, stick)
  }
}