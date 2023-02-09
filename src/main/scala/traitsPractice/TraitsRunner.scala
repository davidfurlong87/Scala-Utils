package traitsPractice

import traitsPractice.TraitsUtils.{Bicycle, Car, Circle, FourWheeler, Rectangle, SUV, Vehicle}

object TraitsRunner {
  def main(args: Array[String]): Unit = {

    //shapes
    val circle1 = new Circle(2)
    println(circle1.area)

    val circle2 = new Circle(5.7)
    println(circle2.area)

    val rectangle1 = new Rectangle(4, 75.4)
    println(rectangle1.area)

    val rectangle2 = new Rectangle(15.3, 12.1)
    println(rectangle2.area)

    //vehicles
    val car = new Car
    val bike = new Bicycle
    val sUV = new SUV

    val vehiclesArray: Array[Vehicle] = Array(car, bike, sUV)
    for (vehicle <- vehiclesArray) {
      println(vehicle.start)
      vehicle match {
        case fw: FourWheeler => println(fw.drive)
        case _ => println("not a 4-wheeler, don't worry about driving")
      }
      println(vehicle.stop)
      println()
    }

  }
}
