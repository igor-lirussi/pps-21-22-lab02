package exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Es8.*
import Es8.Option.*

class Es8Test {


  @Test def testFilter(): Unit = {
    assertEquals(filter(Some(5))(_ > 2), Some(5))
    assertEquals(filter(Some(5))(_ > 8), None())
    assertEquals(filter(None[Int]())(_ > 2), None())
  }

  @Test def testMap(): Unit = {
    assertEquals(map(Some(5))(_ > 2), Some(true))
    assertEquals(map(Some(5))(_ > 8), Some(false))
    assertEquals(map(None[Int]())(_ > 2), None())


  }

  @Test def testMap2(): Unit = {
    assertEquals(Some(3), map2(Some(1))(Some(2))(_+_))
    assertEquals(Some(3), map2(Some(5))(Some(2))(_-_))
    assertEquals(Some(6), map2(Some(3))(Some(2))(_*_))
  }
}
