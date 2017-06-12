package ch04_class_object_trait

object Ex09 {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }
}

class SuperMazinga 
  extends AnotherRobot with AnotherM16 with AnotherBazooka with AnotherCannon

abstract class AnotherRobot {
  def shoot = "뿅뿅"
}

trait AnotherM16 extends AnotherRobot {
  override def shoot = super.shoot + "빵야"
}

trait AnotherBazooka extends AnotherRobot {
  override def shoot = super.shoot + "뿌왕뿌왕"
}

trait AnotherCannon extends AnotherRobot {
  override def shoot = super.shoot + "콰르르릉"
}