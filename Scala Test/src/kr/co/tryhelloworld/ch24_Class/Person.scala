package kr.co.tryhelloworld.ch24_Class

/**
 * 스칼라에서는 클래스를 아주 짧은 코드로도 만들 수 있는데요. 
 * 클래스를 선언하는 부분이 기본 생성자(constructor)의 역할도 하게 됩니다. 
 * 
 * Person1.scala파일을 보세요. 
 * 이렇게 기본생성자에 매개변수를 넣으면 
 * fname과 lname이라는 이름을 가지는 private한 변수가 생깁니다.
 * 
 * Person2.scala에서는 메소드를 정의하는 방법을 확인할 수 있습니다.
 * 
 * Person3.scala에서는 필드를 선언하는 방법을 확인할 수 있습니다.
 * 
 * Person4.scala처럼 매개변수를 val로 선언하면 
 * 해당 이름을 가지는 변수(private)와 public한 getter메소드를 생성합니다.
 * 또 var로 생성자의 매개변수를 선언하면 
 * 해당 이름을 가지는 변수(private)와 public한 getter, setter메소드를 생성합니다.
 * 
 * 스칼라에서는 명시적으로 정의되지 않으면 모두 public으로 간주합니다.
 * 
 * 주의
 * private한 변수의 이름과 getter, setter가 모두 같은 이름을 가지는 경우를 
 * 직접 코드로 구현할 수는 없습니다. 
 * getter와 setter를 사용하기 위해서는 
 * private한 변수의 이름은 다르게 지정해야 하는데요. 
 * 메소드명과 구분하기 위해 _를 변수명 앞에 붙이기도 합니다.
 */
// ① 단순한 클래스
class Person1(
    
  fname:String, 
  
  lname:String
    
)  

// ② 메소드를 가지는 클래스
class Person2(
    
  fname:String, 
  
  lname:String
  
){  
	
  def greet = s"${lname}${fname}님 안녕하세요!" // public한 method
  
}

// ③ public한 val(read only) 필드
class Person3(
    
  fname:String, 
  
  lname:String
  
){  
	
  val fullName = s"${lname}${fname}" // public한 val(read only) 필드
	def greet = s"${fullName}님 안녕하세요!" // public한 method
	
}

/* ④ 
 * val로 선언된 fname는 getter가 자동으로 생성되고
 * var로 선언된 lname은 getter와 setter가 자동으로 생성 */
class Person4(
    
  val fname:String, 
  
  var lname:String
  
)