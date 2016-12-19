package jp.mydns.akanekodou.scala.fizzbuzz

class PatternMatchFizzBuzz extends FizzBuzz {
  private[fizzbuzz] def toFizzBuzz(n : Int) : String = {
    (n % 3, n % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _      => ""
    }
  }

  protected val fb = Stream.from(1).map(toFizzBuzz)
}
