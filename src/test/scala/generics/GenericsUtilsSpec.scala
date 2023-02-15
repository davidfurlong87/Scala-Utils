package generics

import generics.GenericsUtils.{GenericListOfLists, MyStack,largestHashedElementChecker, listReverser}
import org.scalatest.Matchers.{be, convertToAnyShouldWrapper}
import org.scalatest._


class GenericsUtilsSpec extends FlatSpec with Matchers{
  "The MyStack class" should
    "add a single item to its stack" in {
      val myStack: MyStack[String] = new MyStack[String]
      myStack.pushSingle("test")
      myStack.theStack.length should be(1)

  }


  "The MyStack class" should "add multiple items to a stack" in {
      val testStack: MyStack[Int] = new MyStack[Int]
      testStack.pushMultiple(List(1, 2, 3, 4, 5))
    }

  "The GenericListOfLists class" should "filter out null lists" in {
    implicit val strList: List[String] = List("Hi", "there", "my", "name", "is", "Kevin")
    implicit val dblList: List[Double] = List(0.7, 0.2, 4.7, 8.3, 0.5, 5.0)
    val superList: List[List[Any]] = new GenericListOfLists().generateSuperList
    superList.length should be (2)
  }


  "The generic reverse function" should
    "reverse the strings" in {
      implicit val list: List[Int] = List(1, 2, 3, 4 ,5)
      val expected = List(5,4,3,2,1)
      listReverser should be (expected)
    }

  "The largestHashedElementChecker function" should "return the largest value" in {
    implicit val dblList: List[Double] = List(0.7, 0.2, 4.7, 8.3, 0.5, 5.0)
    val dblReturned: Double = largestHashedElementChecker
    dblReturned should be (0.7)
  }

  "The largestHashedElementChecker function" should "throw an exception when given an emty list" in {
    implicit val dblList: List[Double] = List()
    assertThrows[Exception]{
      largestHashedElementChecker
    }
  }



}
