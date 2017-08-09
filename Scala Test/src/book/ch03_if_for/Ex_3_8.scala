package book.ch03_if_for

object Ex_3_8 {
  
  def main(args: Array[String]): Unit = {
    
    /*
     * 이 방법이 스칼라에서 지원하는 이중 반복문 이다.
     * 세미콜론 앞에 있는 조건이 먼저 도는 for 문이고, 뒤에오는 조건이 안쪽에
     * 위치한 for문 이라고 할 수 있다. 3_7의 코드와 성능은 동일하지만 가독성
     * 면에서 이 방식이 깔끔하다.
     */
    for (x <- 1 until 5 ; y <- 1 until 5) {
      
      print(x + " * " + y + " = " + (x * y) + " | ")
      
    }
  }
}