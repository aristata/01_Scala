package book.ch08_combinator

object Ex03_fold {

  def main(args: Array[String]): Unit = {

    val o1 = List(1, 2, 3, 4, 5)
    val o2 = o1.foldLeft(0)((i,j) => i + j)
    println(o2)
  }
}
