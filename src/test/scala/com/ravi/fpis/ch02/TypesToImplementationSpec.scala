package com.ravi.fpis.ch02

import org.scalatest.FlatSpec

class TypesToImplementationSpec extends FlatSpec {
  import com.ravi.fpis.ch02.TypesToImplementation._

  def multiply(a: Int, b: Int) : Int = {
    a*b
  }

  def add(a: Int, b: Int) : Int = {
    a+b
  }

  "Curry the multiplication by 2" should "work" in {
    val multiplyBy2 = curry(multiply)(2)

    assert(multiplyBy2(2) == 4)
    assert(multiplyBy2(4) == 8)
    assert(multiplyBy2(16) == 32)
  }

  "Curry the addition by 2" should "work" in {

    val addBy2 = curry(add)(2)

    assert(addBy2(2) == 4)
    assert(addBy2(4) == 6)
    assert(addBy2(16) == 18)
  }

  "Un Curry the multiplication by 2" should "work" in {
    val curried = curry(multiply)
    val unCurry = un_curry(curried)

    assert(unCurry(2, 2) == 4)
    assert(unCurry(4, 2) == 8)
    assert(unCurry(16, 4) == 64)
  }
}
