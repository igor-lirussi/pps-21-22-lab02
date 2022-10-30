package exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Es6.*

class Es6Test {

  @Test def testCompose(): Unit = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))

    assertEquals((0, 1, 1, 2, 3), (fib(0), fib(1), fib(2), fib(3), fib(4)))
  }


  @Test
  def testFibTail() =
    assertEquals(0, fibTail(0))
    assertEquals(1, fibTail(1))
    assertEquals(1, fibTail(2))
    assertEquals(2, fibTail(3))
    assertEquals(3, fibTail(4))

}