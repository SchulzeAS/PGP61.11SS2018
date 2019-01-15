object Main {
  def func5(num: Int, bo: Boolean, txt: String):String = (num,bo,txt) match{
      case (n,c,t) if ( n>0  &&   c  && t.isEmpty ) => "a"
      case (n,c,t) if (n<=0  &&   c  && t.isEmpty ) => "b"
      case (n,c,t) if ((n>0  ||  !c) && !t.isEmpty) => "c"
      case (n,c,t) if (n<=0  || (!c  && t.isEmpty)) => "d"
    }
    def main(args: Array[String]) {
      println(func5(1,true,"ads"))

    }

}
