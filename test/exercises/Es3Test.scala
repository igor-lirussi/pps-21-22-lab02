package exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Es3.*

class Es3Test {

  val empty: String => Boolean = _ == "" // predicate on strings
  val pos: Int => Boolean = n => n > 0

  @Test def testParity(): Unit = {
    assertEquals("even", parity(2))
    assertEquals("odd", parity(3))
  }

  @Test def testParity2(): Unit = {
    assertEquals("even", parity2(2))
    assertEquals("odd", parity2(3))
  }

  @Test def testParity3(): Unit = {
    assertEquals("even", parity3(2))
    assertEquals("odd", parity3(3))
  }

  @Test def testNeg():Unit = {
    val notEmpty = neg(empty) // which type of notEmpty?
    notEmpty("foo") // true
    notEmpty("") // false
    notEmpty("foo") && !notEmpty("") // true.. a comprehensive test
  }

  @Test def testNeg2(): Unit = {
    val notEmpty = neg2(empty) // which type of notEmpty?
    notEmpty("foo") // true
    notEmpty("") // false
    notEmpty("foo") && !notEmpty("") // true.. a comprehensive test
  }


  @Test def testNegGeneric(): Unit = {
    val notEmpty = negGen(empty) // which type of notEmpty?
    notEmpty("foo") // true
    notEmpty("") // false
    notEmpty("foo") && !notEmpty("") // true.. a comprehensive test
    val notPos = negGen(pos)
    notPos(2) // true
    notPos(-2) // false
    notPos(-2) && !notPos(2) // true.. a comprehensive test
  }


}
