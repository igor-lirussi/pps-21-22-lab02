package exercises

object Es4 extends App {

  //Non curried fun
  val p2: (Int, Int, Int)=>Boolean = (x,y,z)=>(x<=y)&&(y<=z)

  //curried fun
  val p1: Int => (Int => (Int => Boolean)) = x => y => z => (x<=y) && (y<=z)
  //dato un int, torna una funzione che è         y => z => (x<=y) && (y<=z)

  //Non curried def
  def p4(x:Int, y:Int, z:Int): Boolean = (x<=y) && (y<=z)

  //curried def
  def p3(x:Int)(y:Int)(z:Int): Boolean = (x<=y) && (y<=z)
}
