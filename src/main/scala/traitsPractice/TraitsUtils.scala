package traitsPractice

object TraitsUtils {
//  Define a trait Shape that has a method area which returns the area of a shape.
//    Then define classes Circle and Rectangle which extends the Shape trait and implements the area method.
  trait Shape {
    def area: Double
}

  class Circle (radius: Double) extends Shape {
    override def area: Double = {
      3.14159265359 * (radius * radius)
    }
    }

  class Rectangle (width: Double, height: Double) extends Shape {
    override def area: Double = {
      width * height
    }
    }


  //  Define a trait Vehicle that has methods start and stop which return a string indicating that the vehicle has started or stopped.
  //  Then define classes Car and Bicycle which extends the Vehicle trait and implements the start and stop methods.
  //  In addition, define a trait FourWheeler which extends the Vehicle trait and adds a method drive which returns a string indicating that the vehicle is driving.
  //  Finally, define a class SUV which extends both the Car and FourWheeler traits.

  trait Vehicle {
    def start: String
    def stop: String
  }

  trait FourWheeler extends Vehicle {
    def drive: String
  }

  class Car extends Vehicle {
    override def start: String = "Car is starting. Strap on your seatbelts!"

    override def stop: String = "Car is stopping. All 4 wheels locked!"
  }

  class Bicycle extends Vehicle {
    override def start: String = "Peddling started! Nothing more to say!"

    override def stop: String = "Slamming on the brakes. Stop, Bicycle!"
  }

  class SUV extends FourWheeler {
    override def drive: String = "4-Wheel drive in motion, out of the way, guys!"

    override def start: String = "4-Wheel drive, go!"

    override def stop: String = "All 4 Wheels stopping!"
  }
}
