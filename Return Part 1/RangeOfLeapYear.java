import java.util.Scanner;
class RangeOfLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Starting number : ");
		int start = s.nextInt();
		System.out.print("Enter the ending number : ");
		int end = s.nextInt();

		for (int i=start ; i<=end ; i++ )
		{
			if ((i%4==0 && i%100!=0) || i%400==0)
			{
				System.out.println("It is Leap Year : "+i);
			}
		}
	}
}
