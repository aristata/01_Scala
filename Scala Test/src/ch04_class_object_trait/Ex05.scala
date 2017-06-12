package ch04_class_object_trait

object Ex05 {
  def main(args: Array[String]): Unit = {
    val flyingDog = new Animal0
    flyingDog.swim
    flyingDog.fly
    flyingDog.run
  }
}

class Animal0 extends Flying with Swimming with Running

trait Swimming {
  def swim = println("수영을 합니다. 챱챱~")
}

trait Flying {
  def fly = println("하늘을 납니다. 훨훨~")
}

trait Running {
  def run = println("달립니다. 타다닥~")
}

trait Eating {
  def eat
}