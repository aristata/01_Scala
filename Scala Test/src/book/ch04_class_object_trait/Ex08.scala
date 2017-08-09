package book.ch04_class_object_trait

object Ex08 {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
  }
}

/*
 * 이름이 같은 메소드인 shoot()가 여러 개 있지만, 계속해서 extends와 with 예약어
 * 를 사용하여 앞의 shoot()가 덮어쓰여지다가 결국에 남는 것은 마지막 Cannon 트레
 * 이트 안에 들어 있는 shoot()가 실행이 된다.
 */
class Mazinga extends Robot with M16 with Bazooka with Cannon

abstract class Robot {
  def shoot = "뿅뿅"
}

trait M16 extends Robot {
  override def shoot = "드르륵"
}

trait Bazooka extends Robot {
  override def shoot = "포칵"
}

trait Cannon extends Robot {
  override def shoot = "펑"
}