import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the year : ");
		int y=s.nextInt();

		if ((y%4==0 && y%100!=0) || y%400==0)
		{
			System.out.println("It is Leap Year : "+ y);
			return;
		}
		System.out.println("It is Not a Leap Year : "+y);
		
	}
}
