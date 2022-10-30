package exercises

object Es8 extends App {

  enum Option[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object Option:

    def filter[A](opt:Option[A])(fun:A=>Boolean):Option[A] = opt match
      case Some(a) if fun(a) => Some(a)
      case _ => None() //comprende case None() => None()  e se la funzione ritorna false

    def map[A](opt:Option[A])(fun:A=>Boolean):Option[Boolean] = opt match
      case Some(a) => Some(fun(a))
      case _ => None()

    def map2[A](opt:Option[A])(opt2:Option[A])(fun:(A,A)=>A):Option[A] = opt match
      case Some(a) => opt2 match
        case Some(b) => Some(fun(a, b))
      case _ => None()
}
