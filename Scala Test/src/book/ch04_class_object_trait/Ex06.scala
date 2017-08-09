package book.ch04_class_object_trait

object Ex06 {
  def main(args: Array[String]): Unit = {
    val pig = new Animal2
    pig.eat
    pig.run
  }
}

class Animal2 extends Eating with Running {
  
  def eat = println("먹습니다. 쩝쩝")
  
  /*
   * 트레이트에서 구현된 메소드를 덮어버리고 새로운 로직을 구현하고 싶을때는
   * 아래와 같이 오버라이드를 하면 된다.
   */
  override def run = println("달립니다. 뒤뚱~")
  
}
