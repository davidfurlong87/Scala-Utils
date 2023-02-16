package recursion

import com.sun.tools.javac.util.List.nil

import scala.{::, Nil}
import scala.collection.immutable.Nil._
import scala.collection.immutable._

object RecursionUtils {
  //Write a function to calculate the factorial of a number using recursion.
  def factorial(number: Int): Int = {
    number match {
      case  0 => 1
      case _ => number * factorial(number -1)
    }
  }

  //Write a function to find the nth Fibonacci number using recursion.
  def fibonacci(n: Int): Int = {
     def fibonacci_tail(n: Int, a: Int, b: Int): Int = n match {
       case 0 => a
       case _ => fibonacci_tail(n-1, b, a + b)
     }
    fibonacci_tail(n, 0, 1)
  }


  //Write a function to print the elements of a list in reverse order using recursion.
  def listReverser[T](inList: List[T]): List[T] =  {
    def listRevRecursive(resultList: List[T], remainingList: List[T]): List[T] = remainingList match {
      case Nil => resultList
      case (head :: tail) => listRevRecursive(head :: List(), tail)
    }
    listRevRecursive (Nil, inList)
  }

  //Write a function to find the sum of all elements in a list using recursion.
  def recursiveSum(inList: List[Int]): Int = inList match {
    case Nil => 0
    case (head :: tail) => head + recursiveSum(tail)
  }


  //Write a function to find the maximum value in a list using recursion.


}
