import java.util.Scanner;

class AddOfTwoNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the first Number :");
		int a = scan.nextInt();
		System.out.println("enter the second Number :");
		int b = scan.nextInt();
		
		System.out.println("The sum of two number is : "+ (a+b));
	}
}
