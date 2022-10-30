package exercises

object Es6 extends App{

  def fib(n: Int): Int = n match
    case n if n > 1 => fib(n-1)+fib(n-2)
    case 0 | 1 => n

  def fibTail(n: Int): Int =
    @annotation.tailrec
    def _fib(n: Int, current: Int, next: Int): Int = n match
      case 0 => current
      case _ => _fib(n - 1, next, current + next) //current+next fa da accumulatore
      //la funzione procede con n-1 che va all'indietro e next che diventa current+next

    _fib(n, 0, 1)
}