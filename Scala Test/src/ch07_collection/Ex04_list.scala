package ch07_collection

object Ex04_list {

  def main(args: Array[String]): Unit = {

    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = "d" :: "e" :: Nil
    val list3 = list1 :: list2
    val list4 = list1 ::: list2

    for (x <- 0 until list3.size) {
      println(list3(x))
    }
    println("-------------")

    for (x <- 0 until list4.size) {
      println(list4(x))
    }
  }
}
