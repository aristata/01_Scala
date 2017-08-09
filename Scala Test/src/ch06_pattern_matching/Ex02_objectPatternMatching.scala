package ch06_pattern_matching

object Ex02_objectPatternMatching {

  case class Person(

    name: String,

    age: Int,

    rank: String

  )

  def matchAndHi(person: Person): Unit = person match {
    case Person("이멋남", 47, "부회장") => println("부회장님 오셨습니다.")
    case Person("김쾌남", 73, "회장") => println("회장님 오셨습니다.")
//    case Person("박솔로", 28, _) => println("넌 어떻게 왔니?")
//    case Person("박솔로", 28, r) => println(s"${r}님 오셨습니다.")
//    case Person(name, age, "사원") =>
//      if(age > 25) println(s"$name ${age}살이구나. ㅋㅋ")
    case Person(name, age, "사원") if age > 25 =>
       println(s"$name ${age}살이구나. ㅋㅋ")
    case _ => println("매치되는 결과가 없습니다.")
  }

  def main(args: Array[String]): Unit = {
    val person1 = Person("이멋남", 47, "부회장")
    val person2 = Person("김쾌남", 73, "회장")
    val person3 = Person("박솔로", 28, "사원")
    val person4 = Person("김솔로", 25, "사원")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
    matchAndHi(person4)
  }
}
