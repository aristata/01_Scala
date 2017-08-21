package book.ch10_숫자야구

object Ex03_Seq기능으로_볼카운트_반복문 {

  def calcBallCountSeq(ballList: Seq[Int], inputList: Seq[Int]): BallCount = {

    var strikes = 0
    var balls = 0
    var outs = 0

    for (i <- 0 until ballList.length) {
      if (ballList(i) == inputList(i))
        strikes = strikes + 1
      else if (inputList.contains(ballList(i)))
        balls = balls + 1
    }
    BallCount(strikes, balls, outs)
  }

  case class BallCount(strikes: Int, balls: Int, outs: Int)
}
