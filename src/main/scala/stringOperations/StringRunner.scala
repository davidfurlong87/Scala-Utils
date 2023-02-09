package stringOperations

object StringRunner {
  def main(args: Array[String]): Unit = {
    implicit val in: String = "Hello world"
    val inResult = StringOperations.stringReverser
    println(inResult)

//    for (i <- 0 to in.length-1){
//      val charResult = StringOperations.charGetter(in, i)
//      println(charResult)
//    }

    val stringSameChecker: Boolean = StringOperations.stringComparer("Hello", "World")
    val stringSameChecker2: Boolean = StringOperations.stringComparer("Hello", "Hello")
    println(
      s"""
         |StringSameChecker 1: $stringSameChecker
         |StringSameChecker 2: $stringSameChecker2
         |""".stripMargin)

    val subSResult = StringOperations.subStringChecker("Elloder", "lol")
    println(subSResult)

    val stringMadeResult = StringOperations.stringAppender(List('a', 'b','c','d'))
    println(stringMadeResult)
  }
}
