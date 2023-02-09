package mapReduceFilter


object MapReduceFilter {
  def EvenNumbersSquared(implicit numbersList: List[Int]): Int = {
    numbersList.filter(x => x %2 == 0).sum
}

  //"Given a list of names, write a function that takes this list and returns a list of all the names that start with the letter 'A' using map and filter functions.
  def letterAOnly(listOfNames: List[String]): List[String] = {
    listOfNames.filter(name => name.charAt(0).toLower == 'a')
  }

//  "Suppose you have a list of employee data, including their . Write a function that takes a list of names and salaries and returns the total salary of all employees using the reduce function."
  def salarySummer(implicit listOfEmployees: List[(String, Int)]): Int = {
    listOfEmployees.map(_._2).sum
  }

  // Given a list of tuples, write a map-reduce function that calculates the average length of all the strings in the first position of each tuple
  def firstPosAverage(implicit tuplesOfStrings: List[(String, String)]): Int = {
    (tuplesOfStrings.map(_._1.toInt)).sum/tuplesOfStrings.length
  }


}
