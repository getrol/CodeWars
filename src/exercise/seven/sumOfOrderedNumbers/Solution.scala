package exercise.seven.sumOfOrderedNumbers

import general.AbstractSolution

object Solution extends AbstractSolution[(Int, Int), String] {
    val inputAndOutput: Map[(Int, Int), String] = Map(
        (1, 0) -> "1 (1 + 0 = 1)",
        (1, 2) -> "3 (1 + 2 = 3)",
        (0, 1) -> "1 (0 + 1 = 1)",
        (1, 1) -> "1 (1 since both are same)",
        (-1, 0) -> "-1 (-1 + 0 = -1)",
        (-1, 2) -> "2 (-1 + 0 + 1 + 2 = 2)"
    )

    override def getrolSolute(input: (Int, Int)): String = {
        input match {
            case (first, second) =>
                if (first == second) s"$first ($first since both are same)"
                else {
                    val seq = if (first < second) first to second else (second to first).reverse
                    val sum = seq.sum
                    seq.tail.foldLeft(s"$sum (${seq.head} ") { case (acc, next) =>
                        acc + (if (next < 0) s"- ${-next} " else s"+ $next ")} + s"= $sum)"
                }

            case _ => "IllegalInput"
        }
    }

    override def atlxSolute(input: (Int, Int)): String = ""
}
