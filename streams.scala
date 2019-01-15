object Main {

    //implement stream generating primes
    val primeStream: Stream[Int] = 2 #:: Stream.from(3,2).filter(isPrime)

    //write stream for values of the euler phi function
    val eulerPhi: Stream[Int] = ?

    //implement the dying rabits function
    val dyingRabits: Stream[Int] = ?

    def main(args:Array[String]) =
    {
        println("Primes: ")
        primeStream take 10 foreach println
        println("eulersche phi-function: ")
        eulerPhi take 10 foreach println
        println("dying rabits: ")
        dyingRabits take 20 foreach println
     }
}