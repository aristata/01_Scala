package test

// 소인수 분해
object PrimeFactorsTest {

  def result(number: Int, list: List[Int] = List()): List[Int] = {
    for(n <- 2 to number if (number % n == 0)) {
      return result(number / n, list :+ n)
    }
    list
  }

  def main(args: Array[String]): Unit = {
    println(result(36))
  }
}
