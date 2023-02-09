import java.util.Scanner;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the Number : ");
		int ip = s.nextInt();

		int sumOfDigit=AllMethod.sumOfDigit(ip);

		System.out.println("Sum of digit is : "+sumOfDigit);
	}
}
