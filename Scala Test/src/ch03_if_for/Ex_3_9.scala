package ch03_if_for

object Ex_3_9 {
  
  def main(args: Array[String]): Unit = {
    
    /*
     * 조건이 있는 반복
     * i를 2로 나눈 나머지가 0인 것만 반복한다.
     */
    for (i <- (1 to 10) if (i % 2 == 0) ) {
      
      println(i)
      
    }
    
    /*
     * 인덱스가 있는 for문
     * 간혹 반복문에서는 인덱스가 필요한 경우가 있다. 예를 들어 루프가 몇 번째
     * 돌고 있는지 알아야 하는 경우 등이다. 스칼라에서는 이럴때 다음과 같은 방법
     * 을 사용할 수 있다.
     */
//    for( (num, index) <- List.zipWithIndex ) {
//      
//      println(num)
//      
//      println(index)
//      
//    }
    
  }
  
}