package jp.mydns.akanekodou.scala.collection.util

object StreamUtils {
  implicit class iterableCycle [A] (self : Iterable[A]) {
    def cycle() : Stream[A] = Stream.continually(self).flatten
  }
}
