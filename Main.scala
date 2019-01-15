object numbers {


  def printPrimes(from: Int, to: Int) {
    //i will print primes from "from" to "to" into console.
    _printprime(to,from)
  }
  //does count upwards to "to", which is given from printPrimes, infers new argument which is current number.
  def _printprime(to: Int, current : Int){
    if(current < to){
      if(isPrime(current)) {
        print(current )

      }
      _printprime(to, current + 2)

    }
  }
  def isPrime(check: Int) : Boolean ={
      if(check == 1) {return true;}
      return _isPrime(check,check - 1)

  }
  def _isPrime(check: Int,current: Int) : Boolean = {
    //i am help for isPrime, will return false if is mod
    if(current == 1) {return true;}
    return if (check % current == 0) false else _isPrime(check,current - 1);

  }

  def printPGP(n: Int){

    _printPGP(n,0)

  }
  def _printPGP(n: Int, curr : Int){
    if(n<curr){return;}
    print(calcPGP(curr) + " | ")
    _printPGP(n,curr + 1)

  }
  // PGP = (PGP-1) + 2*(PGP-2) + 5
  //inefficient recursion, but does the job.
  def calcPGP(n : Int) : Int = {
    if(n == 0) {return 0}
    if(n == 1) {return 1}
    val x = if(calcPGP(n - 1) < 2000) calcPGP(n - 1) else 0
    return x + (2*calcPGP(n-2)+5)

  }

  def main(args:Array[String]) {

    printPGP(20)
  }
}
//schedule  pgp
