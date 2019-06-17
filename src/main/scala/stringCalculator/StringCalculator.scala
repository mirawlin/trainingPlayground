package stringCalculator

object StringCalculator {
  def add(numbers: String): Int = {
    if (!numbers.isEmpty)
      numbers.split("[\n,]").map(_.toInt).sum
    else 0
  }
}
