object MathOperations {

def succ(x: Int): Int = x+1;
def neg(x: Int): Int = -x;
def pred(x : Int) : Int = neg(succ(neg(x)));
def add(x: Int, y:Int): Int = {
  println(x + " || " + y)
  if( y == 0){
    x

  } else
  if(y>0){
    add(succ(x),pred(y))
  } else
  if(y<0){
    add(pred(x),succ(y))
  } else -1 //I have to always return something
}

def sub(x: Int, y:Int): Int = {

  add(x,neg(y));
}

def mul(x: Int, y:Int): Int = {

  var prefix = 0;
  if(x<0 && y<0) prefix = 1 else
  if(x<0 && y>0) prefix = -1 else
  if(x>0 && y<0) prefix = -1 else
  prefix = 1
  _mul(if(x<0) neg(x) else x, if(y<0) neg(y) else y,if(x<0) neg(x) else x,prefix)
}
def _mul(x : Int,y:Int, orX : Int, prefix : Int): Int = {
  println(x + " | " + y)
  if((y == 1) && prefix == -1) neg(x) else
  if((y == 1) && prefix ==  1) x else
  _mul(add(x,orX),pred(y),orX,prefix)
}

def div(x: Int, y:Int): Int = {
  //I am Ganzzahldivision

    div(if(y<0) neg(x) else x,if(y<0) neg(y) else y,0)
}
def div(x : Int, y : Int, res : Int):Int = {
    if(x<0 && add(x,y) < 0){
      div(add(x,y),y,pred(res))
    } else
    if(x>0 && sub(x,y) > 0){
      div(sub(x,y),y,succ(res))
    } else
    if(x == y || x == neg(y)){
        if(res < 0) pred(res) else
        succ(res)
    } else -42

}

      def main(args: Array[String]): Unit = {
          println(add(2,3))
        println(div(16,4))
    }
}
