package ch03_if_for

object Ex_3_5 {
  
  def main(args: Array[String]): Unit = {
    
    var a = 0
    
    while(a < 20) {
      
      print(a + ", ")
      a = a + 1
      /*
       * 스칼라에는 ++과 같은 연산자가 없다.
       * 그 이유는 ++연산자는 a 자체에 변형을 가하는 일인데,
       * 이는 immutable 속성에 어긋난다.
       * 굳이 이런 연산을 하고 싶으면 라인 12와 같이 사용하라는 뜻에서
       * ++연산자를 만들지 않았다.
       */
      
    }
    
  }
  
}
