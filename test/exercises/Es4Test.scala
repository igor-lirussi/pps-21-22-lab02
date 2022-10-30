package exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import Es4.*

class Es4Test {

  @Test def testNotCurried(): Unit = {
    assertEquals(true, p2(6, 8, 10))
    assertEquals(false, p2(10, 8, 10))
    assertEquals(true, p4(6, 8, 10))
    assertEquals(false, p4(10, 8, 10))
  }

  @Test def testCurrying1(): Unit = {
    //prende int, torna funzione da int a (funzione da int a Bool)
    assertEquals(true, p1(6)(8)(10))
    val greaterThanSix = p1(6) //questa val è funzione da int a (funzione da int a Bool)
    val greaterThanSixEight = p1(6)(8) //la val è funzione da int a Bool
    val greaterThanSixEight2 = greaterThanSix(8) //equivalente a quella sopra
    assertEquals(true, greaterThanSix(8)(10))
    assertEquals(true, greaterThanSixEight(10))
    assertEquals(true, greaterThanSixEight2(10))
    assertEquals(false, greaterThanSix(12)(10)) //devono essere in ordine crescente
    assertEquals(false, greaterThanSixEight(6))
    assertEquals(false, greaterThanSixEight2(6))
  }

  @Test def testCurrying3(): Unit = {
    //prende int, torna funzione da int a (funzione da int a Bool)
    assertEquals(true, p3(6)(8)(10))
    val greaterThanSix = p3(6) _ //questa val è funzione da int a (funzione da int a Bool)
    val greaterThanSixEight = p3(6)(8) //la val è funzione da int a Bool
    val greaterThanSixEight2 = greaterThanSix(8) //equivalente a quella sopra
    assertEquals(true, greaterThanSix(8)(10))
    assertEquals(true, greaterThanSixEight(10))
    assertEquals(true, greaterThanSixEight2(10))
    assertEquals(false, greaterThanSix(12)(10)) //devono essere in ordine crescente
    assertEquals(false, greaterThanSixEight(6))
    assertEquals(false, greaterThanSixEight2(6))

    val greaterThanTen = p3(9)(10)(_) //todo why this?
    val greaterThanNine = p3(9) _
    //val greaterThanTen2=greaterThanNine(10)(_) //todo why not here?
    assertEquals(true, greaterThanTen(11))
    assertEquals(false, greaterThanTen(8))
    assertEquals(true, greaterThanNine(10)(12))
    assertEquals(false, greaterThanNine(12)(8))
  }


}
