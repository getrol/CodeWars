object Main {
  def main(args: Array[String]): Unit = {
    val allPowers = (for {
      i <- 0 to 10
      j <- 0 to 10
      k <- 0 to 10
    } yield (Math.pow(2, i) + Math.pow(2, j) + Math.pow(2, k)).toInt).distinct.sorted
    val allNumbers = List.range(3, 3000)
    val difference = allNumbers.diff(allPowers)
    println(allPowers)
    println(allNumbers)
    println(difference)
  }
}