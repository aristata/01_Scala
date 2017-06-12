package ch04_class_object_trait

object Ex03 {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("사과")
    println(apple.name)
  }
}

/*
 * 케이스 클래스
 * 케이스 클래스는 클래스에서 조금 더 기능을 확장한 클래스 입니다.
 * 아래 케이스 클래스를 예로들어 설명하자면, name이라는 이름을 가진 멤버변수를 
 * 만들어주며, 이는 외부에서도 얼마든지 접근이 가능합니다. 또한, 객체의 정보를
 * 알 수 있게 해주는 toString, hashCode나 equals 등의 메서드를 알아서 생성해
 * 줍니다. 
 */
case class Fruit2(name: String)

/*
 * 참고로 객체 이름과 클래스 이름을 같게 생성할 수 있습니다.
 * 이를 동반객체(companion object)라고 부릅니다. 동반객체와 클래스는 각자의 
 * private 필드나 메서드를 서로 자유롭게 접근할 수 있다는 특징이 있습니다.
 */
