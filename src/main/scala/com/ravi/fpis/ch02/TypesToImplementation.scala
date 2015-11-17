package com.ravi.fpis.ch02

object TypesToImplementation {

  def curry[A, B, C](f: (A, B) => C) : A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

  def un_curry[A, B, C](f: A => B => C) : (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  def compose[A, B, C](f: A => B, g: B => C): A => C = {
    (a: A) => g(f(a))
  }
}
