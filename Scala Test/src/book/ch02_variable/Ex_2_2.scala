package book.ch02_variable

object Ex_2_2 {
  
  def main(args: Array[String]): Unit = {
    
    var a: Int = 5
    var b = a
    
    a = 10
    
    println(a)
    println(b)
  }
}