public class MakeFunctional {
		
	
		static int getDivisorNum(int num)
		{
			//initiate call for _divnum with num and curr
			return _divnum(num,num);
		}
		
private static int _divnum(int num,int curr) {
			if(curr == 1) {return 1;}
			return num%curr == 0 ? _divnum(num, curr - 1) + 1 : _divnum(num, curr - 1) ;
		}
		
	public static void main(String[] Args)
	{
		getDivisorNum(23);
		System.out.println("The number of divisors for 23 is " + getDivisorNum(23));
		
		getDivisorNum(1);
		System.out.println("The number of divisors for 1 is " + getDivisorNum(1));
		
		getDivisorNum(12);
		System.out.println("The number of divisors for 12 is " + getDivisorNum(12));
		
		getDivisorNum(99);
		System.out.println("The number of divisors for 99 is " + getDivisorNum(99));
	}
}