package jp.mydns.akanekodou.scala.fizzbuzz

import jp.mydns.akanekodou.scala.collection.util.StreamUtils._

class StreamZipFizzBuzz extends FizzBuzz {
  private def skip(n : Int, s : String) : List[String] = {
    List.fill(n - 1)("") :+ s
  }

  private val f = skip(3, "Fizz").cycle
  private val b = skip(5, "Buzz").cycle

  protected val fb = (f zip b).map(t => t._1 + t._2)
}
