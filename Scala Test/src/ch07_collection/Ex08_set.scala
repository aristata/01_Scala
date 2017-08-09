package ch07_collection

object Ex08_set {

  def main(args: Array[String]): Unit = {

    var basket: Set[String] = Set()
    basket += "딸기"
    basket += "포도"
    basket += "포도"
    basket += "사과"
    basket += "포도"
    basket += "바나나"
    println(basket)
  }
}
