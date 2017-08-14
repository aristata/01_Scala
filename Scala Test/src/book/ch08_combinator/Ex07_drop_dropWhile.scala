package book.ch08_combinator

object Ex07_drop_dropWhile {

  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4, 5, 6, 0)

    val n = o.drop(4)
    val nn = o.dropWhile(i => i <= 3)

    println(n)
    println(nn)

  }
}
