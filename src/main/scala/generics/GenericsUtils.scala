package generics

import scala.collection.mutable.ListBuffer
import scala.math.Numeric.IntIsIntegral
import scala.reflect.ClassManifestFactory.{Nothing, Null}
import scala.runtime.Nothing$

object GenericsUtils  {

  //class for generating lists of lists
  class GenericListOfLists(
              implicit val genericListInts: List[Int] = null,
              implicit val genericListStrings: List[String] = null,
              implicit val genericListDouble: List[Double] = null
            ) {
    def generateSuperList: List[List[Any]] = {
      //After implicits are checked, this filters out null lists and returns a list of whatever lists it has found.
      List(genericListInts, genericListStrings, genericListDouble).filter(_ != null)
    }
  }


//  Implement a generic method to find the largest element in a given list of any comparable type
  def largestHashedElementChecker[T](implicit genList: List[T]): T = {
    genList.length match {
      case (0) => throw new Exception("Empty list. No elements to check")
      case _ => genList.map(a => a -> a.hashCode()).maxBy(_._2)._1
    }
  }


//  Create a generic class that represents a simple stack and implement push and pop operations on it
  class MyStack[B]() {
    var theStack: ListBuffer[B] = ListBuffer[B]()
    def pushSingle(value: B): Unit = {
      theStack += value
    }

    def pushMultiple(valueList: List[B]) = {
      valueList.foreach(B => theStack += B)
    }

    def pop(): Unit = {
      println(s"The stack is currently $theStack")
      println(s"${theStack.last} is to be removed")
      theStack.remove(theStack.length-1)
      println(s"The stack is now: $theStack")
    }

  }

//  Implement a generic function to check if an element is present in a given list.
  def elementChecker[B](element: B)( implicit listOfElems: List[B]): Boolean = {
    listOfElems.contains(element)
  }


//  Create a generic method to reverse a given list of any type.
  def listReverser[B](implicit theList: List[B]): List[B] = {
    def reverseLoop(inputList: List[B], accumulator: List[B]): List[B] = {
      inputList match {
        case Nil => accumulator
        case head :: tail => reverseLoop(tail, head :: accumulator)
      }
    }
    reverseLoop(theList, Nil)
  }

//  Implement a generic function to find the minimum and maximum elements in a given list of any comparable type.
  def minMaxFinder[B](implicit genericList: List[B]): List[B] = {
    List(
      genericList.map(a => a -> a.hashCode()).maxBy(_._2)._1,
      genericList.map(a => a -> a.hashCode()).minBy(_._2)._1
    )
  }
}
