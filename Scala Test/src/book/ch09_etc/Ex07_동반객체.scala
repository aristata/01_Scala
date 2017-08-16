package book.ch09_etc

object Ex07_동반객체 {

  object Companion {

    private def ma = {}

    def mb = {}

  }

  class Companion {
    val a = Companion.ma
    val b = Companion.mb
  }

  def main(args: Array[String]): Unit = {
    println(Companion.mb)
  }
}
