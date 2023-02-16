package recursion

import generics.GenericsUtils.listReverser
import org.scalatest._
import recursion.RecursionUtils.{factorial, fibonacci, recursiveSum}

class RecursionUtilsSpec extends FlatSpec with Matchers{
  "Factorial method" should
    "Return 120 with 5 as a parameter" in {
      factorial(5) should be (120)
    }

  "Fibonacci method" should
    "return 34 as the 10th fibonacci number" in {
      fibonacci(10) should be (55)
  }

  "listReverser Method" should
    "return List(6,5,4,3,2,1) when given List(1,2,3,4,5,6" in {
    val inputList = List(1,2,3,4,5,6)
    listReverser(inputList) should be (List(6,5,4,3,2,1))
  }

  "Recursive sum method" should
    "return 35 when given an IntList of (5,6,7,8,9)" in {
    recursiveSum(List(5,6,7,8,9)) should be (35)
  }

}
