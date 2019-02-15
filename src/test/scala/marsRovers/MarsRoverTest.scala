package marsRovers

import org.scalatest.{Matchers, WordSpec}

class MarsRoverTest extends WordSpec with Matchers {

  "The Mars rover function turnLeft" should {
    "rotate 90 degrees to the left based on the current direction it is facing" in {
      val facingN = 'N'
      val facingW = 'W'
      val facingS = 'S'
      val facingE = 'E'

      val rover = new MarsRover

      val newDirection1 = rover.turnLeft(facingN)
      val newDirection2 = rover.turnLeft(facingS)
      val newDirection3 = rover.turnLeft(facingE)
      val newDirection4 = rover.turnLeft(facingW)

      newDirection1 shouldEqual 'W'
      newDirection2 shouldEqual 'E'
      newDirection3 shouldEqual 'N'
      newDirection4 shouldEqual 'S'
    }

  }

  "The Mars rover function turnRight" should {
    "rotate 90 degrees to the right based on the current direction it is facing" in {
      val facingN = 'N'
      val facingW = 'W'
      val facingS = 'S'
      val facingE = 'E'

      val rover = new MarsRover

      val newDirection1 = rover.turnRight(facingN)
      val newDirection2 = rover.turnRight(facingS)
      val newDirection3 = rover.turnRight(facingE)
      val newDirection4 = rover.turnRight(facingW)

      newDirection1 shouldEqual 'E'
      newDirection2 shouldEqual 'W'
      newDirection3 shouldEqual 'S'
      newDirection4 shouldEqual 'N'
    }

  }
}
