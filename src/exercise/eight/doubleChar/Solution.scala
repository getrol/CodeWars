package exercise.eight.doubleChar

import general.AbstractSolution

object Solution extends AbstractSolution [String, String]{
  val inputAndOutput: Map[String, String] = Map (
    "String" -> "SSttrriinngg",
    "Hello World" -> "HHeelllloo  WWoorrlldd",
    "1234!_ " -> "11223344!!__  ",
    "abcd" -> "aabbccdd",
    "Adidas" -> "AAddiiddaass",
    "1337" -> "11333377",
    "illuminati" -> "iilllluummiinnaattii",
    "123456" -> "112233445566",
    "%^&*(" -> "%%^^&&**((",
    "" -> ""
  )

  override def getrolSolute(input: String): String = {
    input.foldLeft(""){case (acc, ch) => acc :+ ch :+ ch}
  }

  override def atlxSolute(input: String): String ={
    input.flatMap(i => s"$i$i")
  }
}
