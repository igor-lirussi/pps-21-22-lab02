package exercises

object Es3 extends App{

  //val of function literal (lambda)
  val parity: Int=>String = _ match
    case n if n%2==0 => "even"
    case _ => "odd"

  //def method
  def parity2(n:Int):String = n match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  //lambda imperative body
  val parity3:  Int=> String =
    (x:Int)=>
      if (x%2==0)
        "even"
      else
        "odd"



  val neg: (String=>Boolean) => (String=>Boolean) = (f) => (s => !f(s)) // f va ora in una funzione String to Boolean

  def neg2(f:(String=>Boolean)):(String=>Boolean) = (s => !f(s))
  //è una semplice funzione con in ingresso come parametro f
  //il corpo è semplicemente un return con la funzione desiderata

  def negGen[X](f:(X=>Boolean)) : (X=>Boolean) = (x => !f(x))
}
