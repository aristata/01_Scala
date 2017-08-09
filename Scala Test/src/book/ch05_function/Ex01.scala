package book.ch05_function

/**
 * 함수 정의:
 * def 함수명([매개변수]): [반환 자료형] = {
 * 	// 구현할 로직
 * }
 */
object Ex01 {
  def main(args: Array[String]): Unit = {
    println("반환받은 값1 : " + name() ) 
    println("반환받은 값2 : " + name2() ) 
  }

  /*
   * 스칼라에서는 반환값이 있을 때에도 반환 자료형을 생략할 수 있다.
   */
  def name() = {
    val a = 10
    a
  }
  
  /*
   * 만약 return을 명시적으로 표시하고 싶다면, 아래와 같이 명시적으로 반환 자료
   * 형을 입력해야 한다. 이렇게 명시적으로 반환 자료형을 표시하게 되면 다른 자료
   * 형을 반환하려고 하면 컴파일 에러가 난다.
   */
  def name2(): Int = {
    val a = 10
    return a
  }

}

