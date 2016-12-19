package jp.mydns.akanekodou.scala.fizzbuzz

import org.specs2.mutable.Specification
import org.specs2.specification.Tables

class ApplicatorFizzBuzzTest extends Specification with Tables {
  def testClass = new ApplicatorFizzBuzz

  "ApplicatorFizzBuzz#toFizzBuzz" in {
      "number" |   "result" |
             9 !     "Fizz" |
            10 !     "Buzz" |
            15 ! "FizzBuzz" |
             8 !         "" |> {
      (number, result) => testClass.toFizzBuzz(number) === result
    }
  }
}
