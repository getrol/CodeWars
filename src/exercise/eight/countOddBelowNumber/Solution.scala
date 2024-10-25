package exercise.eight.countOddBelowNumber

object Solution {
    val inputAndOutput =
        Map(15 -> 7,
            7 -> 3)

    def main(args: Array[String]): Unit = {
        val results = inputAndOutput.map { case (input, expected) =>
            val ourSolution = SolutionAtlxdub.solute(input)
            s"Solution is: ${ourSolution == expected}. Our solution was: \"$ourSolution\". Expected solution is: \"$expected\""
        }
        results.map(println)
    }
}


object SolutionGetrol {
    def solute(number: Int): Int = {
       0
    }

}

object SolutionAtlxdub {
    def solute(num: Int = 0): Int = {
        var res = 0
        def loop(count: Int): Int = {
            var number = count
            if (number > 0) {
                if (count % 2 == 0) {
                    number -= 1
                    loop(number)
                }
                else {
                    res += 1
                    number -= 1
                    loop(number)
                }
            }
            else res-1
        }
        loop(num)
    }
}