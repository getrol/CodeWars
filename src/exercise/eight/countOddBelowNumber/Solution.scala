package exercise.eight.countOddBelowNumber

import scala.collection.immutable.HashMap
import scala.math.BigInt

object Solution {
    val inputAndOutput =
        Map(BigInt.int2bigInt(2100000000)*BigInt.int2bigInt(2100000000)*BigInt.int2bigInt(2100000000)*BigInt.int2bigInt(2100000000)
            -> BigInt.int2bigInt(1050000000)*BigInt.int2bigInt(2100000000)*BigInt.int2bigInt(2100000000)*BigInt.int2bigInt(2100000000),
            BigInt.int2bigInt(7) -> BigInt.int2bigInt(3),
            BigInt.int2bigInt(16) -> BigInt.int2bigInt(8),
            BigInt.int2bigInt(0) -> BigInt.int2bigInt(0),
            BigInt.int2bigInt(-4) -> BigInt.int2bigInt(0))

    def main(args: Array[String]): Unit = {
        val results = inputAndOutput.map { case (input, expected) =>
            val ourSolution = SolutionGetrol.solute(input)
            s"Solution is: ${ourSolution == expected}. Input value: ${input}. Our solution was: \"$ourSolution\". Expected solution is: \"$expected\""
        }.toSeq
        results.map(println)
    }
}


object SolutionGetrol {
    def solute(number: BigInt): BigInt = if (number > 0) number / BigInt.int2bigInt(2)
    else 0
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