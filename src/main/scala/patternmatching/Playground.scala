package patternmatching

object Playground {

  def multiplyBy(myNb: Option[Int], multiplier: Int): Int = {
    if (multiplier == 0)
      myNb.get
    else
      myNb.map(number => number * multiplier).getOrElse(0)
  }

  def multiplyByTwoIfExists(myNb: Option[Int]): Int =  {
    myNb.map(number => number * 2).getOrElse(0)
  }

  def goToTheBroomRoom() = {
    val myRooms = Seq("7.03", "brooms", "conferenceRoom")

    myRooms
      .map(str => str.toCharArray)
      .foreach(list => println(list.mkString(" ")))

    println("TESTESTTEST")
    println(myRooms
      .flatMap(str => str.toCharArray))


    println(Option.apply(12)
      .map(x => if (x == 0) None else Option.apply(x *2)))

    println(Option.apply(12)
      .flatMap(x => if (x == 0) None else Option.apply(x *2)))


  }
}
