package book.ch09_etc

object Ex03_사용자입력 {

  def main(args: Array[String]): Unit = {
    print("값을 입력하세요: ")
    var a = scala.io.StdIn.readLine
    println(s"입력하신 값은 $a 입니다.")

  }
}
