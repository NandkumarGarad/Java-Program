// Given number is Fibonacci or not 
import java.util.Scanner;
class FibonacciOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();

		int a = 0 ;
		int b = 1 ;

		int c ;
		while (true)
		{
			c=a+b;
			if (c==num)
			{
				System.out.println("It is Fibonacci number.");
				break;
			}else if (c>num)
			{
				System.out.println("It is Not Fibonacci Number.");
				break;
			}else
			{
				a=b;
				b=c;
			}

		}
	}
}
