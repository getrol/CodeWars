package general

abstract class AbstractSolution[T, R] {

  val inputAndOutput: Map[T, R]

  val getrolSolution: PersonSolution
  val atlxSolution: PersonSolution

  trait PersonSolution {
    def solute(input: T): R
  }

  def main(args: Array[String]): Unit = {
    val getrolResults = "Getrol solutions: " +
      inputAndOutput.zipWithIndex.map { case ((input, expected), index) =>
        val ourSolution = getrolSolution.solute(input)
        s"""Solution ${index + 1}: ${(ourSolution == expected).toString.toUpperCase()}.
           |Input value: ${input}.
           |Our solution was: \"$ourSolution\".
           |Expected solution is: \"$expected\" \n""".stripMargin
      }

    val atlxResults = "Atlxdub solutions: " +
      inputAndOutput.zipWithIndex.map { case ((input, expected), index) =>
        val ourSolution = atlxSolution.solute(input)
        s"""Solution ${index + 1}: ${(ourSolution == expected).toString.toUpperCase()}.
           |Input value: ${input}.
           |Our solution was: \"$ourSolution\".
           |Expected solution is: \"$expected\" \n""".stripMargin
      }

    println(getrolResults)
    println(atlxResults)

  }
}
