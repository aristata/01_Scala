package ch07_collection

object Ex01_array {

  def main(args: Array[String]): Unit = {

    val arrayA = Array(1, 2, 3, 4, 5)

    for (x <- arrayA) {
      println(x)
    }

    val arrayB = Array("a", "b", "c", "d")

    for (x <- arrayB) {
      println(x)
    }
  }
}
