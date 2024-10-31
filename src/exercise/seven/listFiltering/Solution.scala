package exercise.seven.listFiltering

import general.AbstractSolution

object Solution extends AbstractSolution [List[Any], List[Int]]{
  val inputAndOutput: Map[List[Any], List[Int]] = Map(
    List(1, 2, "a", "b") -> List(1, 2),
    List(1, "a", "b", 0, 15) -> List(1, 0, 15),
    List(1, 2, "aasf", "1", "123", 123) -> List(1, 2, 123),
    List("a", "b", "1") -> Nil,
    List(1, 2, 3) -> List(1, 2, 3)
  )

  override def getrolSolute(input: List[Any]): List[Int] = {
    input.filter(_.isInstanceOf[Int]).asInstanceOf[List[Int]]
  }

    override def atlxSolute(input: List[Any]): List[Int] = {
      val res = for (i <- input if i.getClass.getName == "java.lang.Integer") yield i
      res.map(_ .toString.toInt)
    }
  }
