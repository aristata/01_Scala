package book.ch07_collection

object Ex07_map {

  def main(args: Array[String]): Unit = {

    // 1반이 있었습니다. 그 명단은 다음과 같습니다.
    var student1Ban = Map(
      1 -> "고지용",
      2 -> "김말자",
      3 -> "김말이",
      4 -> "김이불",
      5 -> "이재현",
      6 -> "정미쳐",
      7 -> "차수홍",
      8 -> "최예림",
      9 -> "최한잔"
    )

    // 전학생이 왔습니다.
    student1Ban += (10 -> "전학생")

    // 최한잔이 술먹고 퇴학 당했습니다.
    student1Ban -= 9

    // 사람들이 많이 전학을 와서 아예 2반을 만들었습니다.
    var student2Ban = Map(
      11 -> "고세융",
      12 -> "권육삼",
      13 -> "김융찬",
      14 -> "김참치"
    )

    // 관리가 힘들어서 반을 합쳤습니다.
    var students = student1Ban ++ student2Ban

    /*
     *  for 형태의 루프도 가능하고,
     *  foreach를 지원하는 컬렉션이라면 이렇게도 표현 가능
     */
    // 현재 반의 학생명단은 다음과 같습니다.
    students.foreach(i => println(i))

    println()

    // 선생님이 갑자기 5번을 부릅니다.
    val callee = 5
    println("여기 " + callee + "번 없어?")

    // 5번이 반에 있는지 확인합니다.
    println(students.contains(5))

  }
}
