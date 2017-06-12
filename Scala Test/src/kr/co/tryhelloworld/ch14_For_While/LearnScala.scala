package kr.co.tryhelloworld.ch14_For_While

object LearnScala {
	def main(args: Array[String]): Unit = {
		// ① while문
		var i, sum = 0  
		while ( i < 10) {  
			sum += i  
			i+=1 // ++나 --는 제공하지 않으므로 += 1을 사용해야 합니다.
		}  
		println(s"① $sum")

		// ② for문
		sum = 0  
		for ( i <- 0 until 10) {  
		  sum += i  
		}  
		println(s"② $sum")  

		//③ 가장 스칼라스럽게 합을 구하는 방법
		sum = (0 until 10).sum  
		println(s"③ $sum")
	}
}