package ch05_function

object Ex08 {

  def main(args: Array[String]): Unit = {

    printStrings("string1", "string2", "string3")

  }

  /*
   * String* (띄어도 정상작동 함) 라는 표현으로
   * 여러 개의 String을 받을 수 있다는 것을 알 수 있다.
   */
  def printStrings(args: String*) = {

    for (arg <- args) {
      println(arg)
    }

  }

}
