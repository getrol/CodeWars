package exercise.six.breakCamelCase

import general.AbstractSolution


object Solution extends AbstractSolution[String, String] {
    override val inputAndOutput: Map[String, String] = Map(
        "String" -> "SSttrriinngg",
        "Hello World" -> "HHeelllloo  WWoorrlldd",
        "1234!_ " -> "11223344!!__  ",
        "" -> ""
    )

    override def getrolSolute(input: String): String = (for (i <- input) yield s"$i$i").mkString("")

    override def atlxSolute(input: String): String = {
        ""
    }
}