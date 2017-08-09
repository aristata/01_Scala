package ch02_variable

object Ex_2_1 {
  
  def main(args: Array[String]): Unit = {
    
    var a = "변수입니다."
    val b = "final 변수입니다."
    
    a = "바꿀 수 있을까요?"
    //b = "바꿀 수 있을까요?"
    
    println(a)
    
    /*
     * val을 사용하는 이유
     * 스칼라는 함수형 프로그래밍 언어로서, 일반적인 변수뿐만 아니라 함수형태도
     * 변수로 담아서 사용한다. 즉, 변수(var)에 할당할 수 있는 범위가 훨씬 넓어서
     * 그 형태를 확정해주어야 할 필요성이 있다.
     * 또, 스칼라는 immutable(변경불가능)한 속성을 중요시 한다. 
     * 아무나 접근해서 값을 바꾸어 버린다면 프로그램이 문제가 생길 확률이 커지기
     * 때문에, 변하지 않는 값들이라 판단되면 val로 선언하여 프로그램이 확신을 가
     * 질수 있게 한다. 
     */
  }
}