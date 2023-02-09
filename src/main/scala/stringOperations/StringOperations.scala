package stringOperations

object StringOperations {
//  Implement a function to reverse a string using either a built-in method or a custom implementation.
  def stringReverser(implicit inStr: String): String = {
    (for (i <- inStr.length-1 to 0 by -1) yield inStr(i)).mkString
  }

//  Write a Scala program to get the character at the given index within a given String. Also print the length of the string
  def charGetter(inStr: String, pos: Int): Char = {
    println(inStr.length)
    inStr(pos)
  }



  def stringComparer(sA: String, sB: String): Boolean = {
    sA.compareTo(sB) == 0
  }

//  Write a Scala program to test if a given string contains the specified sequence of char values

  def subStringChecker(message: String, subS: String): Boolean = {
      message.contains(subS)
  }

//  Write a Scala program to create a //  new String //  object with the contents of a character array
  def stringAppender(chars: List[Char]): String = {
    chars.mkString("")
  }
}