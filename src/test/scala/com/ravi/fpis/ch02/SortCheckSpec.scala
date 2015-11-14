package com.ravi.fpis.ch02

import org.scalatest.FlatSpec

class SortCheckSpec extends FlatSpec {
  import com.ravi.fpis.ch02.SortCheck._

  "Sorted Strings " should "return true" in {
    val s_alphabet = Array("a","b", "c")
    assert(isSorted(s_alphabet, (a: String, b: String) => {a.compareTo(b)<=0}))

    val s_words = Array("apple","bat", "cat")
    assert(isSorted(s_words, (a: String, b: String) => {a.compareTo(b)<=0}))
  }

  "Sorted Numbers" should "return true" in {
    val s_numbers = Array(1, 2, 3)
    assert(isSorted(s_numbers, (a: Int, b: Int) => {a.compareTo(b)<=0}))
  }

  "Un-Sorted Strings " should "return false" in {
    val s_alphabet = Array("a","b", "z", "c")
    assert(!isSorted(s_alphabet, (a: String, b: String) => {a.compareTo(b)<=0}))

    val s_words = Array("apple","bat", "zoo", "cat")
    assert(!isSorted(s_words, (a: String, b: String) => {a.compareTo(b)<=0}))
  }

  "Un-Sorted Numbers" should "return false" in {
    val s_numbers = Array(1, 2, 4, 3)
    assert(!isSorted(s_numbers, (a: Int, b: Int) => {a.compareTo(b)<=0}))
  }

  "Un-Sorted Strings at the end " should "return false" in {
    val s_alphabet = Array("a","b", "c", "a")
    assert(!isSorted(s_alphabet, (a: String, b: String) => {a.compareTo(b)<=0}))

    val s_words = Array("apple","bat", "cat", "boo")
    assert(!isSorted(s_words, (a: String, b: String) => {a.compareTo(b)<=0}))
  }

  "Un-Sorted Numbers at the end" should "return false" in {
    val s_numbers = Array(1, 2, 3, 0)
    assert(!isSorted(s_numbers, (a: Int, b: Int) => {a.compareTo(b)<=0}))
  }
}
