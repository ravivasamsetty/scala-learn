package com.ravi.fpis.ch02

object SortCheck {
  def isSorted[A](a: Array[A], p: (A,A) => Boolean) : Boolean = {

    @annotation.tailrec
    def loop(n: Int) : Boolean = {
      if(n+1 >= a.length) true
      else if(!p(a(n), a(n+1))) false
      else loop(n+1)
    }

    loop(0)
  }
}
