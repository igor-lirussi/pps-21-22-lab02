package exercises

object Es5 extends App{

  def compose(f: Int=>Int, g: Int=>Int): Int=>Int = num=>f(g(num))

  val composeVal: (f: Int=>Int, g: Int=>Int)=>(Int=>Int) = (f,g) => n=>(f(g(n)))
  //dati f e g, torna una funzione che preso n torna f di g di n

  def composeGen[A,B,C](f: B => C, g: A => B): A => C = num=>f(g(num))



}
