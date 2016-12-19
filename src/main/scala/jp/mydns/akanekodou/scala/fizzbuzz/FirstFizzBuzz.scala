package jp.mydns.akanekodou.scala.fizzbuzz

class FirstFizzBuzz extends FizzBuzz {
  private[fizzbuzz] def toFizzBuzz(n : Int) : String = {
    if (n % 3 == 0) {
      if (n % 5 == 0)
        "FizzBuzz"
      else
        "Fizz"
    } else if (n % 5 == 0) {
      "Buzz"
    } else {
      ""
    }
  }

  protected val fb = Stream.from(1).map(toFizzBuzz)
}
