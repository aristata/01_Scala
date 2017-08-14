package book.ch08_combinator

object Ex08_flatten {

  def main(args: Array[String]): Unit = {
    val o = List(List(1, 2, 3, 4), List(5, 6))
    val n = o.flatten
    println(n)
  }
}
