package exercise.seven.pairsInteger

import general.AbstractSolution

object Solution extends AbstractSolution [Seq[Int], Seq[(Int, Int)]] {
    val inputAndOutput: Map[Seq[Int], Seq[(Int, Int)]] = Map(
        Seq(2, 4) -> Seq((2, 2), (2, 3), (2, 4), (3, 3), (3, 4), (4, 4)),
        Seq(0, 1) -> Seq((0, 0), (0, 1), (1, 1)),
        Seq(0, 0) -> Seq((0, 0))
    )

    override def getrolSolute(input: Seq[Int]): Seq[(Int, Int)] = {
        val m = input.head
        val n = input.last
        val result = for {i <- m to n
             k <- m to n if i <= k} yield (i, k)
        result
    }

    override def atlxSolute(input: Seq[Int]): Seq[(Int, Int)] = Nil

}