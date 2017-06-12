package kr.co.tryhelloworld.ch16_If

object LearnScala {
	def main(args: Array[String]): Unit = {
		
	  /*
	   * 조건문은 Java나 C와 거의 같습니다.
	   * 하지만 스칼라에서 중요한 차이점은 if문도 수식(Expression)이라는 점입니다. 
	   * 그래서 코드의 24번째 줄과 같이 if문만으로 삼항연산자를 대신할 수 있습니다.
	   */
	  
	  if (true)   
			println("한 줄은 {괄호}를 생략할 수 있습니다.")  

		if (1 + 1 == 2) {  
			println("여러 줄은")  
			println("{괄호}가 필요합니다.")  
		} else {  
			println("컴퓨터가 미쳤나봐요.")  
		}

		val likeEggs = false  
		// 삼항 연산자대신 이렇게 쓸 수 있습니다.
		val breakfast =  
		  if (likeEggs) "계란후라이"  
		  else "사과"  

		println(s"아침으로 ${breakfast}를 먹어요")  
	}
}