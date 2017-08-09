package book.ch04_class_object_trait

/**
 * 믹스인(mixin)
 * 추상 클래스에 원하는 트레이트를 섞어서 최종적인 클래스 형태를 만들 수 있다.
 */
object Ex07 {
  def main(args: Array[String]): Unit = {
    val flyPig = new Pig
    flyPig.eat
    flyPig.shout
    flyPig.fly
  }
}

class Pig extends Animal with Flying with Eating {
  def shout = println("꿀꿀")
  def eat = println("쩝쩝")
}

abstract class Animal {
  def shout
}

