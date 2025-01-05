package exercise.six.orderPlease

import general.AbstractSolution


object Solution extends AbstractSolution[String, String] {
  override val inputAndOutput: Map[String, String] = Map(
    "is2 Thi1s T4est 3a" -> "Thi1s is2 3a T4est",
    "4of Fo1r pe6ople g3ood th5e the2" -> "Fo1r the2 g3ood 4of th5e pe6ople",
    "" -> ""
  )

  override def getrolSolute(input: String): String = {
    val splitWord = input.split(" ")
    val indexToWordMap = splitWord.map(word => word.find(_.isDigit).map(_.toInt).getOrElse(0) -> word).sortBy(_._1)
    indexToWordMap.map(_._2).mkString(" ")
  }

  override def atlxSolute(input: String): String = {
    val indexedSeq = input.split("\\D").mkString.toList
    val words = input.split("\\s")
    val test = (indexedSeq zip words).sortBy(_._1)
    test.map(_._2).mkString(" ")
  }
}