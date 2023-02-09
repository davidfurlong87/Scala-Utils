package simpleStringExercises

object SimpleStringRunner {
  def main(args: Array[String]): Unit = {
    implicit val listOfStr: List[String] = List("hello", "there", "how", "are", "you")
    println(SimpleStrings.concatStrings)

    implicit val longStr: String = "whats up with all you cool people here"
    val splitIntoArray: Array[String] = SimpleStrings.subStringMaker
    println(splitIntoArray.length)
    for (s <- splitIntoArray){
      println("1")
      println(s)
    }
  }
}
