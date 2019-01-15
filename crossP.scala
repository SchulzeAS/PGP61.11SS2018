object Main {

  def listToString (inputList: List[Int]) : String = {
  val ipl = inputList.reverse;
  ipl.foldLeft("")((acc, i) => i.toChar + acc) //Foldright would be better, so I reverse before, because throws error



  }

  def kreuzProdukt(inputList: List[(Int, Int, Int)]): (Int, Int, Int) = {

    inputList.foldLeft(0,0,0)((acc, i) =>  crossPofTwo(acc,i) )
  }
  def crossPofTwo(x : (Int,Int,Int) , y : (Int,Int,Int)) : (Int,Int,Int) = {
  val v = ((x._2 * y._3-x._3 * y._2),(x._3*y._1-x._1*y._3),(x._1*y._2-x._2*y._1));
  if(x._2 == 0 && x._1 == 0 && x._3 == 0){
      y
  } else if (y._1 == 0 && y._2 == 0 && y._3 == 0){
    x
  } else v

  }
  def ltr(x : Int) : Character = {

    return  (x).toChar
  }

  def main(args: Array[String]) {
    val testList: List[Int] = List(80, 114, 111, 103, 114, 97, 109, 109, 105, 101, 114, 112, 97, 114, 97, 100, 105, 103, 109, 101, 110)
    val vectorList: List[(Int,Int,Int)] = List((1,2,3),(4,5,6),(7,8,9))
    println(listToString(testList))
    println(crossPofTwo(crossPofTwo((1,2,3),(4,5,6)),(7,8,9)));
    println(kreuzProdukt(vectorList))
  }
}
