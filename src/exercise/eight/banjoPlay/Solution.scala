package exercise.eight.banjoPlay

import general.AbstractSolution

object Solution extends AbstractSolution [String, String]{
  val inputAndOutput: Map[String, String] = Map (
    "Adam" -> "Adam does not play banjo",
    "Paul" -> "Paul does not play banjo",
    "Ringo" -> "Ringo plays banjo",
    "bravo" -> "bravo does not play banjo",
    "rolf" -> "rolf plays banjo"
  )

  override def getrolSolute(input: String): String = {
    input.headOption match {
      case Some(firstChar) if firstChar.toLower == 'r' => s"$input plays banjo"
      case _ => s"$input does not play banjo"
    }
  }

  override def atlxSolute(input: String): String ={
    var suove = (input.charAt(0) == 'r' || input.charAt(0) == 'R')
    if (suove == true)
      s"$input plays banjo"
    else
      s"$input does not play banjo"
  }

}
