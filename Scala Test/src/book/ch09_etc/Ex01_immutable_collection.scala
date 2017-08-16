package book.ch09_etc

object Ex01_immutable_collection {

  def main(args: Array[String]): Unit = {

    val list = List(10, 20, 40, 55)

    def foreach(list: List[Int]) = {

      def add(list: List[Int], total: Int): Int = {

        list match {

          // 만약 리스트 안의 값이 하나도 없으면 바로 total을 반환함
          case List() => total

          // 만약 리스트 안의 값이 하나만 있으면 total에 더함
          case List(item) => total + item

          // 그 이외의 경우에는 재귀적으로 add함수를 호출하여 더함
          case head :: tail => add(tail, total + head)
        }

      }

      add(list, 0)
    }

    println(foreach(list))
  }
}
