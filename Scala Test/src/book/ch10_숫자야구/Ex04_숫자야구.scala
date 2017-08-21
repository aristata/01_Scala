package book.ch10_숫자야구

import book.ch10_숫자야구.Ex01_정규표현식과패턴매칭.convertInputs
import book.ch10_숫자야구.Ex03_Seq기능으로_볼카운트_반복문.{BallCount, calcBallCountSeq}

import scala.io.StdIn.readLine
import scala.util.Random

object Ex04_숫자야구 {

  def main(args: Array[String]): Unit = {

    println("숫자야구 게임을 시작합니다.")
    val ballList = Random.shuffle(0 to 9).drop(7)

    while (true) {

      print("숫자를 입력하세요(000 ~ 999): ")
      val inputList = convertInputs(readLine)

      if (inputList != None) {

        val ballCount = calcBallCountSeq(ballList, inputList.get)

        ballCount match {
          case BallCount(0, 0, 0) =>
            println("아웃입니다.")
          case BallCount(3, 0, 0) => {
            println("3스트라이크입니다. 프로그램을 종료합니다.")
            System.exit(0)
          }
          case BallCount(strike, 0, 0) =>
            println(s"$strike 스트라이크!")
          case BallCount(0, ball, 0) =>
            println(s"$ball 볼!")
          case BallCount(strike, ball, 0) =>
            println(s"$strike 스트라이크! $ball 볼!")
          case _ =>
            println("처리 불가")
        }

      } else {
        println("제대로 된 값을 입력하세요.")
      }
    }
  }
}
