package exercise.eight.countOddBelowNumber

object Solution {
    val inputAndOutput =
        Map(15 -> 7,
            7 -> 3,
            16 -> 8,
            0 -> 0)

    def main(args: Array[String]): Unit = {
        val results = inputAndOutput.map { case (input, expected) =>
            val ourSolution = SolutionGetrol.solute(input)
            s"Solution is: ${ourSolution == expected}. Our solution was: \"$ourSolution\". Expected solution is: \"$expected\""
        }
        results.map(println)
    }
}


object SolutionGetrol {
    def solute(number: Int): Int = number / 2
}

object SolutionAtlxdub {
    def solute(word: String): String = ???
}