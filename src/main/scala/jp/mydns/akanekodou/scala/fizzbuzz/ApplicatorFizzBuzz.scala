package jp.mydns.akanekodou.scala.fizzbuzz

class ApplicatorFizzBuzz extends FizzBuzz {
  private val applicators = Map(3 -> "Fizz", 5 -> "Buzz")

  private[fizzbuzz] def toFizzBuzz(n : Int) : String = {
    applicators.filterKeys(n % _ == 0).values.mkString
  }

  protected val fb = Stream.from(1).map(toFizzBuzz)
}
