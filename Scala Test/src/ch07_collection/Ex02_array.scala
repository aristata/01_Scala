package ch07_collection

import scala.Array.ofDim

object Ex02_array {

  def main(args: Array[String]): Unit = {

    /*
     *  자료형에서 자유로운 배열
     */
    val arrayA = Array(13, "hi", 1.42)

    for (x <- arrayA) {
      println(x)
    }

    /*
     *  다차원 배열
     */
//    val matrix = ofDim(4, 5)
//    matrix(2)(3)
  }
}
