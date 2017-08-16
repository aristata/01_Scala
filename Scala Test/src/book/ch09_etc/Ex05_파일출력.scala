package book.ch09_etc

import java.io.{File, PrintWriter}

import scala.io.StdIn

object Ex05_파일출력 {

  def main(args: Array[String]): Unit = {
    val fileName = "Scala Study File Output result.txt"
    val input = StdIn.readLine("파일에 쓸 내용을 입력하세요: ")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close

    println(s"입력하신 $input 텍스트를 $fileName 에 저장했습니다.")
  }
}
