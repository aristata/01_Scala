package kr.co.tryhelloworld.ch13_InputVar

object LearnScala {
	def main(args: Array[String]): Unit = {

	  /*
	   * 튜플을 이용해서 한 번에 여러개의 변수에 값을 넣을 수 있습니다.
	   */
		var (x, y, z, c, python, java) = (1, 2, 3, true, false, "no!")  
		println(x, y, z, c, python, java)  
	
	}
}