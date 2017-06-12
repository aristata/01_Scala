package kr.co.tryhelloworld.ch21_CollectionType

/**
 * Array, List, Set, Map의 구성요소는 어떤 타입이든 사용할 수 있지만, 
 * 최종 타입은 공통으로 상속받는 타입 중 최상위 타입으로 결정됩니다.
 */
object LearnScala {
	
  class Animal()
	
  class Dog() extends Animal()

	def main(args: Array[String]): Unit = {
		
    /* Animal과 Dog이 공통으로 상속받는 최상위 타입은 
     * Animal이므로 아래 코드는 정상 실행
     */
		val array:Array[Animal] = Array(new Animal(), new Dog())
		// val wrongArray:Array[Dog] = Array(new Animal(), new Dog()) 올바르지 않은 타입

		// List도 같은 원리로 동작(Animal이 List의 element의 타입)
		val list:List[Animal] = List(new Animal(), new Dog())

		// Set도 같은 원리로 동작(Animal이 Set의 element의 타입)
		val set:Set[Animal] = Set(new Animal(), new Dog())

		// Map도 같은 원리로 동작
		val map:Map[String, Animal] = Map("Animal" -> new Animal(), "Dog" -> new Dog())		
	}
}