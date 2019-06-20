package stringCalculator

object StringCalculator {
  def add(numbers: String): Int = {
    if (!numbers.isEmpty) {
      val (nbs, delimiter) = if (numbers.startsWith("//"))
        (numbers.substring(4), s"[\n${numbers.charAt(2)}]")
      else (numbers, "[\n,]")

      nbs.split(delimiter)
        .map(convertStringToInt)
        .sum
    }
    else 0
  }

  private def convertStringToInt(s: String): Int = {
    val num = s.toInt
    if (num < 0)
      throw new NumberNotAllowedException(s"negatives not allowed - $num")
    else num
  }
}


class NumberNotAllowedException(message: String) extends Exception(message)