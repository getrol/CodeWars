package general

import java.time.Instant

trait AbstractSolution[T, R] {

  val inputAndOutput: Map[T, R]

  def getrolSolute(input: T): R

  def atlxSolute(input: T): R

  private def collectResult(name: String, solution: T => R): String = {

    val headString = s"*********$name solutions*********\n"
    val testResults = inputAndOutput.map { case (input, expected) =>
      val startTime = System.currentTimeMillis()
      val ourSolution = solution(input)
      val finishTime = System.currentTimeMillis()
      (ourSolution == expected, input, ourSolution, expected, finishTime - startTime)

    }

    val result = headString +
      s"Successfully passed tests - ${testResults.count(_._1)}/${testResults.size}\n" +
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
    val getrolResults = collectResult("Getrol", getrolSolute)
    val atlxResults = collectResult("Atlxdub", atlxSolute)

    println(getrolResults)
    println(atlxResults)

  }
}
