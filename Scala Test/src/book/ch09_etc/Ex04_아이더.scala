package book.ch09_etc

import scala.io.StdIn.readLine

object Ex04_아이더 {

  def main(args: Array[String]): Unit = {
    val input = readLine("값을 입력하세요: ")
    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e : Exception => Left(input)
    }
    println(result.getClass)
  }
}
