package test

import scala.collection.mutable

// 소수 구하기
object PrimeTest {


  def factors(inputNumber: Int) = {
    val primes = mutable.Buffer[Long](2)

    def isPrime(i: Int): Boolean = {
      primes.takeWhile(_ <= math.sqrt(i).toInt).forall(i % _ != 0)
    }

    for (n <- 3 until inputNumber) {
      if (isPrime(n)) {
        primes += n
      }
    }

    primes.toList
  }

  def main(args: Array[String]): Unit = {
    val result = factors(15)
    print(result)
  }
}
