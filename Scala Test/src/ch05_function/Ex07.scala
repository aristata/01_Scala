package ch05_function

object Ex07 {
  def main(args: Array[String]): Unit = {
    val result = calc(x => x * x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start: Int, end: Int) = {
    // 합계를 구하는 재귀함수
    def loop(index: Int, sum: Int): Int = {
      
      // 인덱스가 끝 값보다 크면 sum을 반환
      if(index > end) sum
      // 아니면 계속 더함
      else loop(index + 1, f(index) + sum)
    }
    
    // 루프를 최초로 호출
    loop(start, 0) 
  }
}

