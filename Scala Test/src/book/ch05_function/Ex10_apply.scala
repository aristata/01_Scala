package book.ch05_function

object Ex10_apply {

  /*
   *  apply() 메서드는 언제 호출 될까?
   *  apply()를 명시적으로 호출하지 않았다면, 인스턴스를 부를때 자동으로 apply()가 호출된다.
   */
  class SomeClass {
    def apply(m: Int) = method(m)
    def method(i: Int) = i + i
    def method2(s: String) = s
  }

  def main(args: Array[String]): Unit = {
    val something = new SomeClass
    println(something(2))
  }
}
