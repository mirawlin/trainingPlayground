package stringCalculator

object StringCalculator {
  def add(numbers: String): Int = {
    if (numbers.isEmpty)
      0
    else if (numbers.contains(","))
      numbers.split(",").map(_.toInt).sum
    else numbers.toInt
  }
}
