import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		
		int fact = 1;
		while (num>0)
		{
			fact *= num;
			num--;
		}
		System.out.println("Factorial is Given Number : "+fact);
	}
}
