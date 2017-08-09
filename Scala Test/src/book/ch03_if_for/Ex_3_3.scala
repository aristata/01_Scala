package book.ch03_if_for

object Ex_3_3 {
  
  def main(args: Array[String]): Unit = {
    
    /*
     * 반복문에서 to는 이하를 뜻한다.
     * 아래 반복문에서 1 ... 10 까지 출력될 것이다.
     */
    for(x <- 1 to 10)
      println("x의 값은 " + x)
      
  }
}