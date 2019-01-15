object FunctionHigherOrder {
  def strecken(func: Double => Double, k: Double): Double => Double = k * func(_)

  def strecken2(func: Double => Double, k: Double): Double => Double = { x: Double => k * func(x) }

  // i)
  def moveGraph(func: Double => Double, x: Double, y: Double): Double => Double = {k : Double => func(k+x) + y}

  // ii)
  def addFunc(func1: Double => Double, func2: Double => Double): Double => Double = {k: Double => func1(k) + func2(k)  }

  // iii) nicht sicher, ob ich diesen Teil der Aufgabe richtig verstanden habe.
  def operateFunction(func: Double => Double, operator: (Double => Double) => (Double => Double)): Double => Double = {
    operator(func)
  }

  def f1(x: Double): Double = x * x
  def f2(x: Double): Double = 4 * x + 7

  def main(args: Array[String]): Unit = {
    def g = strecken(f1, 2)
    def h = strecken2(f1, 2)
    def c = operateFunction(h,moveGraph(_,2,2))
    println(g(2))
    println(g(4))
    println(h(2))
    println(c(2))
    println(h(4))
  }
}
