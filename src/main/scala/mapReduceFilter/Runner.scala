package mapReduceFilter



object Runner {

  def main(args: Array[String]): Unit = {
    implicit val numbersList: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
    val numbersListResult = MapReduceFilter.EvenNumbersSquared
    println(s"Result: $numbersListResult")

    implicit val namesList: List[String] = List("Adam", "Jake", "Amy", "Jacob", "Geoffrey", "Adrian")
    val namesListResult = MapReduceFilter.letterAOnly(namesList)
    namesListResult.foreach(name => println(name))

    implicit val employeesList: List[(String, Int)] = List(("dave", 15000), ("Jake", 40000), ("Adam", 75000))
    val employeesListResult: Int = MapReduceFilter.salarySummer
    println(employeesListResult)

    implicit val tuplesOfStrings: List[(String, String)] = List(("i","am"),("he", "is"),("you", "are"))
    val tuplesOfStringResult: Int = MapReduceFilter.firstPosAverage
    println(tuplesOfStringResult)
  }

}
