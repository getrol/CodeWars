package exercise.six.areTheSame

import general.AbstractSolution

import scala.util.control.Breaks.break

object Solution extends AbstractSolution[(Seq[Int], Seq[Int]), Boolean] {
  override val inputAndOutput: Map[(Seq[Int], Seq[Int]), Boolean] = Map(
    (Seq(121, 144, 19, 161, 19, 144, 19, 11),
     Seq(121, 14641, 20736, 361, 25921, 361, 20736, 361)) -> true,
    (Seq(121, 144, 19, 161, 19, 144, 19, 11),
     Seq(132, 14641, 20736, 361, 25921, 361, 20736, 361)) -> false,
    (Seq(121, 144, 19, 161, 19, 144, 19, 11),
     Seq(121, 14641, 20736, 36100, 25921, 361, 20736, 361)) -> false,
  )

  override def getrolSolute(input: (Seq[Int], Seq[Int])): Boolean = {
    val massiveOne = input._1
    val massiveTwo = input._2
    val newInput1 = massiveOne.distinct.map(Math.pow(_, 2))
    val results = for {
      outer <- newInput1
      inner <- massiveTwo if outer == inner
    } yield true
    massiveTwo.length == results.length
  }

  override def atlxSolute(input: (Seq[Int], Seq[Int])): Boolean = {
    val m1 = input._1
    val m2 = input._2.map(x => math.sqrt(x))

    val res = for {
      n <- m2
      j <- m1
      if j == n
    } yield n

    res.size / 2 == m2.size
  }

}
