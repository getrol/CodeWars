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
        /*
        val res = input.toArray

        val res2 = for (n <- res if n.isUpper) yield res.indexOf(n)
        if (res2.isEmpty)
            input
        else {
            val out = res2.mkString.toInt
            input.patch(out, " ", 0)
        }*/
        val res = input.toArray
        val out2 = res.map(n => n + "" + n)

        out2.mkString
    }
}