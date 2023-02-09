import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the Number : ");
		int num=s.nextInt();
			int num1 = 0;
			int num2 = 1;
			int num3;
		while (num>0)
		{
			num3= num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=num3;

			num--;
		}

		 
	}
}
