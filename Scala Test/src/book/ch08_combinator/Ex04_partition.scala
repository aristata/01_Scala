package book.ch08_combinator

object Ex04_partition {

  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)
    val n = o.partition(i => i < 3)
    println(n)
  }

}
