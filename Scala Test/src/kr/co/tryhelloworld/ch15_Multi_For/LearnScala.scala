package kr.co.tryhelloworld.ch15_Multi_For

object LearnScala {
	def main(args: Array[String]): Unit = {
		for( a<- 1 to 3){
			for( b <- 10 to 12){
				println(a,b)
			}
		}
		println("중첩된 for문 대신 아래와 같이 쓸 수 있습니다.")
		for( a <- 1 to 3; b <- 10 to 12){
			println(a,b)
		}
	}
}