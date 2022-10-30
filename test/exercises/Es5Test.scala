package exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Es5.*

class Es5Test {

  @Test def testCompose(): Unit = {
    assertEquals(9, compose(_ - 1, _ * 2)(5))
  }

  @Test def testComposeVal(): Unit = {
    assertEquals(9, composeVal(_ - 1, _ * 2)(5))
  }


  @Test def testComposeGen(): Unit = {
    val sub: Int => Int = _ - 1
    val twice: Int => Int = _ * 2
    assertEquals(9, composeGen(sub, twice)(5)) //ora sa che vanno da Int in Int
    assertEquals(9, composeGen[Int, Int, Int](_ - 1, _ * 2)(5))
    val subDoub: Double => Double = _ - 0.5
    val twiceDouble: Double => Double = _ * 2.5
    assertEquals(10, composeGen(twiceDouble, subDoub)(4.5)) //ora sa che vanno da Double a Double
  }
}
