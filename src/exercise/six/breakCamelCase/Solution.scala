package exercise.six.breakCamelCase


object Solution {
    val wordsAndSolutions =
        Map("helloWorld" -> "hello World",
            "camelCase" -> "camel Case",
            "breakCamelCase" -> "break Camel Case"
        )

    def main(args: Array[String]): Unit = {
        val results = wordsAndSolutions.map { case (word, expected) =>
            val ourSolution = SolutionAtlxdub.solute(word)
            s"Solution is: ${ourSolution == expected}. Our solution was: \"$ourSolution\". Expected solution is: \"$expected\""
        }
        results.map(println)
    }
}


object SolutionGetrol {
    def solute(word: String): String = {
        word.toUpperCase()
    }

}

object SolutionAtlxdub {
    def solute(word: String): Unit = {


    }
}