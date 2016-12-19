package jp.mydns.akanekodou.scala.fizzbuzz

class SecondFizzBuzz extends FizzBuzz {
  private[fizzbuzz] def toFizzBuzz(n : Int) : String = {
    var str = ""
    if (n % 3 == 0) str += "Fizz"
    if (n % 5 == 0) str += "Buzz"
    str
  }

  protected val fb = Stream.from(1).map(toFizzBuzz)
}
