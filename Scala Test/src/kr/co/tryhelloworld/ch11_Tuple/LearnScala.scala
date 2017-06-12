package kr.co.tryhelloworld.ch11_Tuple

object LearnScala {
	def main(args: Array[String]): Unit = {
	  
	  // t1과 같이 튜플은 여러 타입의 객체를 담을 수 있습니다.
		val t1 = new Tuple3(1, "hello", true)
		
		// t1을 줄여서 t2와 같이 많이 사용합니다
		val t2 = (1, "hello", true)
		
		/*
		 * 튜플은 내부적으로 담고 있는 객체의 수에 따라 다른 클래스로 구현되는데요. 
		 * t1과 같이 3개의 객체를 담고 있으면 Tuple3클래스를 이용하게 됩니다. 
		 * Tuple1부터 Tuple22까지 사용할 수 있고, 
		 * 그 이상을 쓰려면 컬렉션과 같은 다른 자료구조를 사용해야 합니다.
		 */
		
		println(t2)

		var numbers = (1,2,3,4)
		
		/*
		 * 튜플의 값에 접근하려면 ._1, ._2와 같은 메소드를 사용하면 됩니다.
		 */
		val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4
		println(sum)
	}
}