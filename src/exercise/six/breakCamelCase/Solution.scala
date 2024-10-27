package exercise.six.breakCamelCase

import general.AbstractSolution


object Solution extends AbstractSolution[String, String] {
  override val inputAndOutput: Map[String, String] = Map(
    "helloWorld" -> "hello World",
    "camelCase" -> "camel Case",
    "breakCamelCase" -> "break Camel Case",
    "StartWithUpper" -> "Start With Upper",
    "have spaceInCenter" -> "have space In Center",
    "upperDIRECTLYInWord" -> "upper DIRECTLY In Word",
    "" -> "",
    "one" -> "one"
  )

  override def getrolSolute(input: String): String = {
    val regularExpression1 = "[a-z][A-Z]".r
    val regularExpression2 = "[A-Z][A-Z][a-z]".r


    val innerResult = regularExpression1.replaceAllIn(input, iterator => {
      val letters = iterator.toString()
      letters.slice(0, 1) + " " + letters.slice(1, 2)
    })

    val outResult = regularExpression2.replaceAllIn(innerResult, iterator => {
      val letters = iterator.toString()
      letters.slice(0, 1) + " " + letters.slice(1, 3)
    })
    outResult
  }

  override def atlxSolute(input: String): String = ""

}