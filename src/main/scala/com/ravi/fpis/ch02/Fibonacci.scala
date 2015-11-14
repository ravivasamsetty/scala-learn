package com.ravi.fpis.ch02

object Fibonacci {
  def fib(k: Int) : Int = {
    def go(n: Int, a: Int, b: Int) : Int = {
      if(n==0) a
      else go(n-1, a+b, a)
    }

    go(k-1, 0, 1)
  }
}
