package ch05_function

object Ex06 {
  def main(args: Array[String]): Unit = {

    //val g = f _
    val g: (Int => Int) = f

    println( f(1) )
  }
  
//  def f(i: Int) = i
  def f = (i: Int) => i
}