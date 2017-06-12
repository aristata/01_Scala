package kr.co.tryhelloworld.ch17_Array

object LearnScala {

  /*
   * 배열의 내용을 출력하는 메소드
   * 배열은 그냥 출력하면 배열의 내용을 출력해 주지 않습니다. 
   * 내용을 출력하려면 .mkString(",")과 같은 메소드를 이용해야 합니다.
   */
	def printArray[K](array:Array[K]) = 
	  println(array.mkString("Array(" , ", " , ")")) 
	
  def main(args: Array[String]): Unit = {
		
	  /*
	   * 배열은 Array(element1, element2, ...)와 같이 만들 수 있습니다.
	   * 스칼라의 배열은 자바의 배열에 대응하는 개념입니다.
	   * 예를들어 자바에서 int[]는 스칼라에서 Array[Int]와 같습니다.
	   */
	  
		// ① Array[Int]  
		val array1 = Array(1, 2, 3)
		print("① ")
		printArray(array1)

		// ② Array[Any]
		val array2 = Array("a", 2, true)
		print("② ")
		printArray(array2)
		
		/*
		 * 스칼라의 배열은 mutable입니다. 
		 * 사이즈를 변경할 수 있다는 의미가 아니라 
		 * 들어있는 값을 변경할 수 있다는 의미의 mutable입니다.
		 */

		// ③ 배열의 값을 읽고 쓰기
		val itemAtIndex0 = array1(0)		
		array1(0) = 4
		print("③ ")
		printArray(array1)

		// ④ 배열을 붙일때는 ++연산자를 이용
		// 앞에 붙일때는 +:, 뒤에 붙일때는 :+ 연산자
		val concatenated = "앞에 붙이기" +: (array1 ++ array2) :+ "뒤에 붙이기"
		print("④ array1과 array2를 더하면: ")
		printArray(concatenated)

		// 값으로 index찾기
		array2.indexOf("a")

		// ⑤ 다른 값만 가져오기
		val diffArray = Array(1,2,3,4).diff(Array(2,3))
		print("⑤ Array(1,2,3,4).diff(Array(2,3))의 결과: ")
		printArray(diffArray)

		
		val personArray = Array( ("솔라",1), ("문별",2), ("휘인",3) )		
		// ⑥ Find 메소드를 이용해서 findByName이라는 메소드 생성
		// Find는 조건에 맞는 값을 찾으면 검색을 중단
		// getOrElse는 일치하는 값이 없을 경우 넘겨줄 기본 값
		// getOrElse가 없을때 일치하는 값이 없으면 None
		def findByName(name:String) = 
		  personArray
		    .find(_._1 == name)
		    .getOrElse(("화사",4))
		    
		val findSolar = findByName("솔라")  // 값("솔라",1)을 찾아서 넘겨줌
		val findSun = findByName("태양")  // 값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
		println(findSolar)
		println(findSun)
	}
}