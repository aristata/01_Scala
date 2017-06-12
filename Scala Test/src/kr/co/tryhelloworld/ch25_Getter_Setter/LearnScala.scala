package kr.co.tryhelloworld.ch25_Getter_Setter

/**
 * 자바와 달리 스칼라에서는 변수(val, var)와 
 * 메소드(def)는 같은 이름을 사용할 수 없습니다. 
 * 예를들어 자바에서는 int name;이라는 필드와 
 * int name(){ return 0; }이라는 메소드가 한 클래스에 있을 수 있지만, 
 * 스칼라에서는 안 됩니다. 
 * 그래서 JPerson.scala를 보면 필드 이름은 _name으로, 
 * setter는 name_으로, getter는 name으로 정의하고 있습니다.
 * 
 * 자바 스타일의 getter와 setter가 필요하면 
 * @BeanProperty를 활용하면 되는데요. 
 * SPerson.scala를 보면 getName과 setName이라는 메소드를 가지는 클래스를 
 * 한 줄로 간단히 만들고 있습니다.
 */
object LearnScala {
	def main(args: Array[String]): Unit = {		
		val jp = new JPerson("자바 스타일")  
		val sp = new SPerson("스칼라 스타일")

		println(jp.name)  
		println(sp.name)  

		jp.name += " 싫어요!"  
		sp.name += " 좋아요!"  

		println(jp.getName)  
		println(sp.getName)
	}
}