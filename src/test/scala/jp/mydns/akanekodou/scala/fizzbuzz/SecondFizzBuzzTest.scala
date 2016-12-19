package jp.mydns.akanekodou.scala.fizzbuzz

import org.specs2.mutable.Specification
import org.specs2.specification.Tables

class SecondFizzBuzzTest extends Specification with Tables {
  def testClass = new SecondFizzBuzz

  "SecondFizzBuzz#toFizzBuzz" in {
      "number" |   "result" |
             9 !     "Fizz" |
            10 !     "Buzz" |
            15 ! "FizzBuzz" |
             8 !         "" |> {
      (number, result) => testClass.toFizzBuzz(number) === result
    }
  }
}
