package exercise.eight.countOddBelowNumber

import general.AbstractSolution


object Solution extends AbstractSolution[BigInt, BigInt] {
  val inputAndOutput = Map(BigInt(210000000)
    -> BigInt(105000000),
    BigInt(7) -> BigInt(3),
    BigInt(16) -> BigInt(8),
    BigInt(0) -> BigInt(0),
    BigInt(-4) -> BigInt(0))

  override def getrolSolute(input: BigInt): BigInt = if (input > 0) input / BigInt(2) else 0

  override def atlxSolute(input: BigInt): BigInt = {
    def loop(count: BigInt, res: BigInt): BigInt = {
      if (count  > 0)
        if (count % 2 == 0)
          loop(count - 1, res)
        else
          loop(count - 1, res + 1)
      else res
    }

    if (input % 2 == 0 )
      loop (input, 0)
      else loop (input - 1, 0)
  }
}
