package book.ch07_collection

object Ex03_list {

  def main(args: Array[String]): Unit = {

    val list = "a" :: "b" :: "c" :: Nil

    for (x <- 0 until list.size)
      println(list(x))
  }
}
