package simpleStringExercises

object SimpleStrings {
  //  Concatenating two or more strings.
  def concatStrings(implicit listOfStr: List[String]): String = {
    listOfStr.mkString(" ")
  }

  def subStringMaker(implicit longStr: String): Array[String] = {
    longStr.split(" ")
  }
}
