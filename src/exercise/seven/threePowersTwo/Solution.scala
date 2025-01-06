package exercise.seven.threePowersTwo

import general.AbstractSolution

object Solution extends AbstractSolution[BigInt, Boolean] {
  val inputAndOutput: Map[BigInt, Boolean] = Map(
    (BigInt(1) -> false),
    (BigInt(2) -> false),
    (BigInt(3) -> true),
    (BigInt(4) -> true),
    (BigInt(5) -> true),
    (BigInt(9) -> true),
    (BigInt(15) -> false),
    (BigInt(276) -> true),
    (BigInt(354) -> false),
  )

  /** Не решено */
  override def getrolSolute(input: BigInt): Boolean = {
    val border = input / 2
    val two = BigInt(2)
    var iList, jList, kList = BigInt(0)
    var hasTrue = false
    while (iList <= border ) {
      while (jList <= border) {
        while (kList <= border) {
          val res = two.modPow(iList, 1) + two.modPow(jList, 1) + two.modPow(kList, 1)
          if (res == input) hasTrue = true
          kList += 1
        }
        jList += 1
        kList = 0
      }
      iList += 1
      jList = 0
      kList = 0
    }
    hasTrue
  }

  override def atlxSolute(input: BigInt): Boolean = false

}
