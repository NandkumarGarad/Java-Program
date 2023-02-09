import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the Number : ");
		int ip = sc.nextInt();

		int rev = AllMethod.revNumber(ip);
		System.out.println("Reverse number is : "+rev);
	}
}
