package book.ch08_combinator

object Ex02_filter {

  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4, 5)

    val filterTest = o.filter(i => i >= 3).map(i => i * 2)

    println(filterTest)

    val filterNotTest = o.filterNot(i => i >= 3).map(i => i * 2)

    println(filterNotTest)
  }
}
