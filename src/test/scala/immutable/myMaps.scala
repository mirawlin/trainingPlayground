package immutable

import org.scalatest.{Matchers, WordSpec}

import scala.collection.mutable

class myMaps extends WordSpec with Matchers {

  "immutable map" should {
    "test how to add elements to map" in {
      val myMap: scala.collection.immutable.Map[String, String] = Map("cat" -> "mouse")

      val myMap2 = myMap + ("dog" -> "bird")

      println(myMap)
      println(myMap2)
    }

    "retrieve a value from a key" in {
      val myMap: scala.collection.immutable.Map[String, Int] = Map("cat" -> 10)

      println(myMap("cat"))

      //      myMap("cat") = 11 //Cannot update the value of immutable maps
    }
  }

  "mutable map" should {
    "test how to add elements to map" in {
      val myMap: scala.collection.mutable.Map[String, String] = mutable.Map("cat" -> "mouse")
      println(myMap)
      myMap("cat") = "elephant"

      println(myMap)

      myMap += ("dog" -> "bird")

      println(myMap)

    }
  }
}