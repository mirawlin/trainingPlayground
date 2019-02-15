package marsRovers

class MarsRover {


  def turnLeft(facing: Char): Char = {
    if (facing == 'N')
      'W'
    else if (facing == 'S')
      'E'
    else if (facing == 'E')
      'N'
    else if (facing =='W')
      'S'
    else '*' //implement some sort of exception handling?
  }

  def turnRight(facing: Char): Char = {
    if (facing == 'N')
      'E'
    else if (facing == 'S')
      'W'
    else if (facing == 'E')
      'S'
    else if (facing =='W')
      'N'
    else '*' //implement some sort of exception handling?
  }
}
