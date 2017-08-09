package book.ch05_function

object Ex09 {

  def main(args: Array[String]): Unit = {
    println(s"기본값은 ${default()}")
  }

  def default(

    a: Int = 4,

    b: Int = 5

  ): Int = a + b

}
