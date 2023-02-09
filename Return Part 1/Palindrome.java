import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the Number : ");
		int num = s.nextInt();

		int rev = AllMethod.revNumber(num);

		if (num== rev)
		{
			System.out.println("It is Palindrome Number");
			return;
		}
			System.out.println("It is Not Palindrome Number");
	
	}
}
