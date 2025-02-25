package exercise.eight.bmi

import general.AbstractSolution

object Solution extends AbstractSolution [(Int, Double), String]{
  val inputAndOutput: Map[(Int, Double), String] = Map (
    (50, 1.80) -> "Underweight",
    (80, 1.80) -> "Normal",
    (90, 1.80) -> "Overweight",
    (110, 1.80) -> "Obese",
    (50, 1.50) -> "Normal"
  )

  override def getrolSolute(input: (Int, Double)): String = {
    val weight = input._1
    val height = input._2
    val bmi = weight/(height*height)
    () match {
      case _ if bmi <= 18.5 => "Underweight"
      case _ if bmi <= 25.0 => "Normal"
      case _ if bmi <= 30.0 => "Overweight"
      case _ => "Obese"
    }
  }

  override def atlxSolute(input: (Int, Double)): String ={
    def bmi(weight: Int, height: Double): String = {
      val bmi = weight / Math.pow(height, 2)
      val res = bmi match {
        case bmi if bmi <= 18.5 => "Underweight"
        case bmi if bmi <= 25.0 => "Normal"
        case bmi if bmi <= 30.0 => "Overweight"
        case bmi if bmi > 30 => "Obese"
        case _ => "miss output, Check your input parameters"
      }
      res
    }
    bmi(input._1, input._2)
  }
}
