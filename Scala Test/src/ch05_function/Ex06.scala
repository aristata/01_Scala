package ch05_function

object Ex06 {
  def main(args: Array[String]): Unit = {
    val g = f _
    println( f(1) )
  }
  
  def f(i: Int) = i
}