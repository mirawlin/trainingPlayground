package coffeeMachine.model

trait Drink

case class Coffee(sugar: Int, stick: Boolean = false) extends Drink

case class Tea(sugar: Int, stick: Boolean = false) extends Drink

case class Chocolate(sugar: Int, stick: Boolean = false) extends Drink

case class Comment(msg: String) extends Drink