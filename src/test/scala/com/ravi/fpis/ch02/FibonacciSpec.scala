package com.ravi.fpis.ch02

import org.scalatest.FlatSpec

class FibonacciSpec extends FlatSpec {
  import com.ravi.fpis.ch02.Fibonacci._

  "1st Fibonacci Number " should "be 0" in {
    assert(fib(1) == 0)
  }

  "2nd Fibonacci Number " should "be 1" in {
    assert(fib(2) == 1)
  }

  "3rd Fibonacci Number " should "be 1" in {
    assert(fib(3) == 1)
  }

  "5th Fibonacci Number " should "be 3" in {
    assert(fib(5) == 3)
  }
}
