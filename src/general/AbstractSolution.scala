package general

trait AbstractSolution[T, R] {

  val inputAndOutput: Map[T, R]

  def getrolSolute(input: T): R

  def atlxSolute(input: T): R


  protected def initialize = println(this.inputAndOutput.toString())

  private def collectResult(name: String, solution: T => R): String = {
    val headString = s"*********$name solutions*********\n"
    val testResults = inputAndOutput.map { case (input, expected) =>
      val startTime = System.currentTimeMillis()
      val ourSolution = solution(input)
      val finishTime = System.currentTimeMillis()
      (ourSolution == expected, input, ourSolution, expected, finishTime - startTime)

    }
    val timeSum = testResults.foldLeft(0L){case (acc, (_, _, _, _, time)) => acc + time}
    val result = headString +
      s"Successfully passed tests - ${testResults.count(_._1)}/${testResults.size}\n" +
        s"Time was spent: $timeSum milliseconds\n" +
      testResults.zipWithIndex.map { case ((isSuccess, input, ourSolution, expected, time), index) =>
        s""" Solution ${index + 1}: ${isSuccess.toString.toUpperCase()}
           | Input value: "$input".
           | Our solution was: \"$ourSolution\".
           | Expected solution is: \"$expected\".
           | Algorithm was in work $time milliseconds \n""".stripMargin
      }.mkString("\n")
    result
  }


  def main(args: Array[String]): Unit = {
    initialize
    val getrolResults = collectResult("Getrol", getrolSolute)
    val atlxResults = collectResult("Atlxdub", atlxSolute)

    println(getrolResults)
    println(atlxResults)

  }
}
