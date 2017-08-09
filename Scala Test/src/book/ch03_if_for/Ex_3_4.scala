package book.ch03_if_for

object Ex_3_4 {
  
  def main(args: Array[String]): Unit = {
    
    /*
     * until은 미만을 뜻한다.
     * 1 ... 9 까지 출력될 것이다.
     */
    for(x <- 1 until 10)
      println("x의 값은 " + x)
      
  }
  
}