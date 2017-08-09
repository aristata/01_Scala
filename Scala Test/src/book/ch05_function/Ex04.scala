package book.ch05_function

/**
 * Call By Name 방식의 함수:
 * 결론적으로 함수를 실행하는 것이 아니라, 함수 자체를 부른다는 뜻
 */
object Ex04 {
  def main(args: Array[String]): Unit = {
    dropship( people(5) )
  }
  
  def people(n: Int) = {
    println("탑승 수속을 시작합니다")
    n
  }
  
  /*
   * dropship(n: Int)가 아닌, dropship(n: => Int)와 같이 사용하면
   * 바깥에 있는 함수를 먼저 실행했다가 매개변수가 필요할 때 그것을 사용한다. 
   */
  def dropship(n: => Int) = {
    println("드랍십 준비합니다.")
    println(n + "명 탑승했습니다.")
  }
}