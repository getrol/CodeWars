package exercise.six.splitStrings

import general.AbstractSolution


object Solution extends AbstractSolution[String, List[String]] {
  val inputAndOutput: Map[String, List[String]] = Map(
    "asdfadsf" -> List("as", "df", "ad", "sf"),
    "asdfads" -> List("as", "df", "ad", "s_"),
    "" -> List(""),
    "x" -> List("x_")
  )

  override def getrolSolute(input: String): List[String] = {
    List("")
  }

  override def atlxSolute(input: String): List[String] = {
    List("")
  }
}
