package book.ch03_if_for

object Ex_3_7 {
  
  def main(args: Array[String]): Unit = {
    
    /*
     * 일반적인 이중 반복문과 같이 스칼라에서도 이중 반복문을 사용할 수 있다.
     * 다만 이와 같은 방식은 작성하기 번거롭고 보기에도 좋지 않아, 스칼라에서는
     * 새로운 방식의 이중 for문을 지원한다. 예제 3_8 참조
     */
    for(x <- 1 until 5) {
      
      for(y <- 1 until 5) {
      
        print(x + " * " + y + " = " + (x * y) + " | ")
        
      }
      println()
      
    }
  }
}