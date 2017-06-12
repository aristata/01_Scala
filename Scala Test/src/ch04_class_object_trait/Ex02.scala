package ch04_class_object_trait

object Ex02 {
  def main(args: Array[String]): Unit = {
    val apple = new Fruit("사과")
    println(apple.name)
  }
}

class Fruit(input: String) {
  var name = input
}