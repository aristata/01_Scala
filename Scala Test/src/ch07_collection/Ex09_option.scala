package ch07_collection

object Ex09_option {

  def main(args: Array[String]): Unit = {

    val students = Map(
      1 -> "세은이",
      2 -> "정팔이",
      3 -> "정봉이"
    )

    val one = students.get(1)
    val four = students.get(4)

    println(one)
    println(four)
    println(one.get)
    println(four.getOrElse("값이 없습니다."))
  }
}
