package book.ch09_etc

object Ex06_접근제한자 {

  object o1 {
    private def ma = {}
    def mb = {}
  }

  object o2 {
    // val a = o1.ma 컴파일 에러
    val b = o1.mb
  }

  def main(args: Array[String]): Unit = {
    println(o1.mb)
    println(o2.b)
  }
}
