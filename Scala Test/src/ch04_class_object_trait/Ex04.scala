package ch04_class_object_trait

object Ex04 {
  
  def main(args: Array[String]): Unit = {
    val richUser = new PaidUser("고길동", 35, 'M', 1000000)
    richUser.sayName
    richUser.showMoney
  }
  
}

/**
 * 부모 클래스
 */
class User(
  name: String,
  age: Int,
  sex: Char
){
  val sayName = println("제 이름은 " + name)
}

/**
 * 자식 클래스
 */
class PaidUser(
  name: String,
  age: Int,
  sex: Char,
  money: Int
) extends User(name, age, sex) {
  val showMoney = println(money + "원이 있습니다")
}

