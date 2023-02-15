package generics

import generics.GenericsUtils.{GenericListOfLists, MyStack, elementChecker, largestElementChecker, listReverser, minMaxFinder}

object GenericsRunner {
  def main(args: Array[String]): Unit = {

    //Implicit vals to be picked up by GenericListOfLists class
    implicit val genericIntList: List[Int] = List(1, 2, 3, 67, 32, 87, 17, 20)
    implicit val strList: List[String] = List("Hi", "there", "my", "name", "is", "Kevin")
    implicit val dblList: List[Double] = List(0.7, 0.2, 4.7, 8.3, 0.5, 5.0)

    //Generic list of lists runner
    implicit val superList: List[List[Any]] = new GenericListOfLists().generateSuperList
    for (list <- superList){
//      println(s"'${largestElementChecker(list)}' is the largest element when hashed")
//      println()
    }

//    MyStack Runner
    //unsure how the vals below are mutable.
    val stringStack = new MyStack[String]
    stringStack.pushSingle("Hello")
    stringStack.pushSingle("1")
    stringStack.pushMultiple(List("hi", "there", "how are you?"))
    stringStack.pop
    println()

    val intStack = new MyStack[Int]
    intStack.pushSingle(1)
    intStack.pushMultiple(List(5,3,76,34,876))
    intStack.pop
    println()

//    Element checker runner
    println(elementChecker(element = 1))
    println(elementChecker("David"))
    println(elementChecker(7.5))

    // List Reverser Runner
    println(listReverser[String])
    println(listReverser[Double])

    //Minmax runner
    println(minMaxFinder[String])

  }
}
