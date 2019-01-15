import scala.annotation.tailrec

object Main {
	
	def func1(n:Int) : Int = {
		if (n < 10)
			func2(n)
		else
			func1(n/10) + func2(n % 10)
	}
	
	def func2(n: Int) : Int = {
		if (n <= 2)
			n
		else
			n * func2(n-1)
	}
	
    def test(n:Int) : Boolean = {
        if (n > 2)
        	func1(n) == n
        else
        	false
    }


    def main(args:Array[String]) {
        println(test(2))
        println(test(145))
		println(test(99))

		//TODO: quick test for equivalence
    }
}