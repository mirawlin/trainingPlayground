package fizzBuzzLvl2

class Fizzy {

  def getNumber(num: Int): String = {
    if (num % 15 == 0)
      "fizzbuzz"
    else if (num % 3 == 0)
      "fizz"
    else if (num % 5 == 0)
      "buzz"
    else if (num.toString.contains("3"))
      "fizz"
    else if (num.toString.contains("5"))
      "buzz"
    else num.toString

  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val fizzy = new Fizzy
    (1 to 100).foreach(num => println(fizzy.getNumber(num)))
  }
}
