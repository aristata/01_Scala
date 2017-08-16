package book.ch09_etc

object Ex02_ex01_easily_alteration {

  def main(args: Array[String]): Unit = {

    val list = List(10, 20, 40, 55)
    val result = list.foldLeft(0)( (total, item) => total + item )
    println(result)

  }

}
