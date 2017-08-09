package book.ch08_combinator

object Ex01_map {

  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)
    println(o)

    val n = o.map(i => i * 10)
    println(n)
  }
}
