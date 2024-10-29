package exercise.eight.sheepCount

import general.AbstractSolution

object Solution extends AbstractSolution [Array[Boolean], Int] {
  val inputAndOutput: Map[Array[Boolean], Int] = Map(
    Array(
      true,  true,  true,  false,
      true,  true,  true,  true,
      true,  false, true,  false,
      true,  false, false, true,
      true,  true,  true,  true,
      false, false, true,  true
    ) -> 17,
    Array(true) -> 1,
    Array(false, false) -> 0,
    Array() -> 0,
    Array(false, true, true, false) -> 2
  )

  override def getrolSolute(input: Array[Boolean]): Int = 0

  override def atlxSolute(input: Array[Boolean]): Int = {
    val res = for (i <- input if i == true) yield i
    res.size
  }
}
