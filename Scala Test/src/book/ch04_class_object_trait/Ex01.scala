package book.ch04_class_object_trait

class Vehicle() {
  
  var price : Int = 100000
  
  var hood : String = "expensive hood"
  
}

object Ex01 {
  
  def main(args: Array[String]): Unit = {
    
    val car = new Vehicle()
    
    println(car.price)
    println(car.hood)
    
  }
}