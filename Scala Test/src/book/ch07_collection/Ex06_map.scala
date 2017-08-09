package book.ch07_collection

object Ex06_map {

  def main(args: Array[String]): Unit = {

    val map = Map(
      "number1" -> "aa",
      "number2" -> "bb",
      "number3" -> 3,
      5 -> "cc"
    )

    println(map.isEmpty)
    println("whole map : " + map)
    println("keys : " + map.keys)
    println("values : " + map.values)

    println(map("number1"))
  }
}
