package exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Es7.*
import Es7.Shape.*

class Es7Test {

  @Test def testShape(): Unit = {
    val rect = Rectangle(2, 3)
    val square = Square(4)
    val circle = Circle(5)
    assertEquals(perimeter(Rectangle(2, 3)), perimeter(rect))
    assertEquals(perimeter(Square(4)), perimeter(square))
    assertEquals(perimeter(Circle(5)), perimeter(circle))
    assertEquals(10, perimeter(rect))
    assertEquals(16, perimeter(square))


    assertEquals(area(Rectangle(2, 3)), area(rect))
    assertEquals(area(Square(4)), area(square))
    assertEquals(area(Circle(5)), area(circle))
    assertEquals(6, area(rect))
    assertEquals(16, area(square))

  }



}