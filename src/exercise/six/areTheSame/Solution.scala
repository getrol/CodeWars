package exercise.six.areTheSame

import general.AbstractSolution

import scala.util.control.Breaks.break


object Solution extends AbstractSolution[(Seq[Int], Seq[Int]), Boolean] {
    override val inputAndOutput: Map[(Seq[Int], Seq[Int]), Boolean] = Map(
        (Seq(121, 144, 19, 161, 19, 144, 19, 11), Seq(121, 14641, 20736, 361, 25921, 361, 20736, 361))  -> true,
        (Seq(121, 144, 19, 161, 19, 144, 19, 11), Seq(132, 14641, 20736, 361, 25921, 361, 20736, 361)) -> false,
        (Seq(121, 144, 19, 161, 19, 144, 19, 11), Seq(121, 14641, 20736, 36100, 25921, 361, 20736, 361)) -> false,
    )




    override def getrolSolute(input: (Seq[Int], Seq[Int])): Boolean = {
        val massiveOne = input._1
        val massiveTwo = input._2
        getrol1(massiveOne, massiveTwo)
    }

    override def atlxSolute(input: (Seq[Int], Seq[Int])): Boolean = {
        true
    }


    private def getrol1(input1: Seq[Int], input2:Seq[Int]): Boolean = {
        val newInput1 = input1.distinct.map(Math.pow(_, 2))
        val results = for {
            outer <- newInput1
            inner <- input2 if outer == inner
        } yield true
        input2.length == results.length
    }
}