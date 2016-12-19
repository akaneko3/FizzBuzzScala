package jp.mydns.akanekodou.scala.fizzbuzz

abstract class FizzBuzz {
  protected val fb : Stream[String]

  def fizzbuzz() : Unit = {
    1 to 100 zip fb map {
      case (n, "") => n
      case (_, s) => s
    } foreach println
  }
}
