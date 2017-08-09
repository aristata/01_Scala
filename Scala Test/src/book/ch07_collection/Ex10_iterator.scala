package book.ch07_collection

object Ex10_iterator {

  def main(args: Array[String]): Unit = {

    val list = List("a", "b", "c")
    val i = list.iterator
    while(i.hasNext)
      println(i.next)
  }
}
