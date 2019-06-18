package stringCalculator

object StringCalculator {
  def add(numbers: String): Int = {
    if (!numbers.isEmpty) {
      if (numbers.startsWith("//")) {
        val delimiter = numbers.charAt(2)
        numbers
          .substring(4)
          .split(delimiter)
          .map(_.toInt)
          .sum }
      else numbers.split("[\n,]").map(_.toInt).sum }
    else 0
  }
}
