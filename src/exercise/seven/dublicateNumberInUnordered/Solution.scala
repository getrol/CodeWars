package exercise.seven.dublicateNumberInUnordered

import general.AbstractSolution

object Solution extends AbstractSolution[Seq[Int], Int] {
  val inputAndOutput: Map[Seq[Int], Int] = Map(
    Seq(1, 1, 2, 3) -> 1,
    Seq(1, 2, 2, 3) -> 2,
    Seq(5, 4, 3, 2, 1, 1) -> 1,
    Seq(1, 3, 2, 5, 4, 5, 7, 6) -> 5,
    Seq(8, 2, 6, 3, 7, 2, 5, 1, 4) -> 2
  )

  override def getrolSolute(input: Seq[Int]): Int = {
    input.diff(input.distinct).head
  }

  override def atlxSolute(input: Seq[Int]): Int = 0
}
