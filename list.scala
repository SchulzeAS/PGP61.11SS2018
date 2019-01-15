object Main {

  //a)
  def grouping[T](xs: List[T], rule: T => Boolean): Tuple2[List[T], List[T]] = ???

  //b)
  def translate(listofnumbers: List[Int]): List[String] = ???

  def main(args: Array[String]) {
    println(grouping(List(1, 2, 100, 3, 4, 501, 12), (x: Int) => x >= 100))
    println(grouping(List('A', 'C', 'Z', 'T', 'O', 'P', 'N', 'M', 'Y'), (x: Char) => x >= 'J'))

    println(translate(List(1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19)))
    println(translate(List(20,30,40,50,60,70,80,90)))
    println(translate(List(100,200,300,400,500,600,700,800,900)))
    println(translate(List(1000,2000,3000,4000,5000,6000,7000,8000,9000)))
    println(translate(List(120,1999,9999,999,99,42,21,123,345)))
  }
}