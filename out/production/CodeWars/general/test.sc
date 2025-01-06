val allPowers = (for {
  i <- 0 to 10
  j <- 0 to 10
  k <- 0 to 10
} yield (Math.pow(2, i) + Math.pow(2, j) + Math.pow(2, k)).toInt).distinct.sorted
val allNumbers = List.range(2,1000)
println(allPowers.diff(allNumbers).mkString(","))