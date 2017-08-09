package book.ch05_function

/**
 * Call By Value 방식의 함수:
 * 안쪽의 함수가 반환하는 값이 다시 바깥쪽의 함수에 들어가는 식
 */
object Ex03 {
  def main(args: Array[String]): Unit = {
    dropship( people(5) )
  }
  
  def people(n: Int) = {
    println("탑승수속을 시작합니다.")
    n
  }
  
  def dropship(n: Int) = {
    println("드랍십 준비합니다.")
    println(n + "명 탑승했습니다.")
  }
}