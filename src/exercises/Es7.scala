package exercises

object Es7 extends App{


  enum Shape:
    case Rectangle(x1: Double, x2: Double)
    case Circle(radius: Double)
    case Square(x: Double)

  def perimeter(shape: Shape): Double = shape match
    case Shape.Rectangle(x1, x2) => (x1 + x2) * 2
    case Shape.Circle(radius) => 2*radius*Math.PI
    case Shape.Square(x) => x*4

  def area(shape: Shape): Double = shape match
    case Shape.Rectangle(x1, x2) => x1 * x2
    case Shape.Circle(radius) => radius * radius * Math.PI
    case Shape.Square(x) => x * x

}
