package kr.co.tryhelloworld.ch18_List

object LearnScala {
	def main(args: Array[String]): Unit = {
	  /*
	   * 리스트는 List(element1, element2, ...)와 같이 생성합니다.
	   */
		// List[Any](기본 리스트를 사용하므로 Immutable) 
		val list = List("a", 1, true)

		/*
		 * 스칼라의 기본 List는 scala.collection.immutable.List이므로 
		 * 값을 변경할 수 없는 속성을 가지고 있습니다. 
		 * 즉, 리스트에 값을 추가하거나 제거하는 작업은 리스트에 반영되는 게 아닙니다. 
		 * 해당 변경사항을 반영한 새로운 리스트를 만들어내는 방식으로 동작합니다.
		 * 기본 List는 Linked list로 구현됩니다.
		 */
		// ① 값을 읽어올 수는 있지만
		val firstItem = list(0)
		// 아래줄과 같이 값을 변경할 수는 없음
		// list(0) = "b"
		println(s"① $firstItem")

		// ② 앞에 붙이기는 :: 또는 +: 연산자
		// 리스트 두개를 붙이기는 ++ 또는 :::연산자
		// 뒤에 붙이기는 :+연산자(immutable list에서 효율적인 방법이 아님)
		val concatenated = 0 :: list ++ list :+ 1000
		println(s"② $concatenated")

		// ③ Diff
		val diffList = List(1,2,3,4) diff List(2,3)
		println(s"③ $diffList")

		//④ 배열의 Find와 같은 방식으로 동작
		val personList = List( ("솔라",1), ("문별",2), ("휘인",3) )
		
		def findByName(name:String) = 
		  personList
		    .find(_._1 == name)
		    .getOrElse( ("화사",4) )
		    
		val findSolar = findByName("솔라")  //값("솔라",1)을 찾아서 넘겨줌
		val findSun = findByName("태양")  //값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감

		println(s"④ ${findSolar}, ${findSun}")
	}
}