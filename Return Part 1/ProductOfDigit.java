import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the Number : ");
		int ip = s.nextInt();

		int prodOfDigit = AllMethod.prodOfDigit(ip);

		System .out.println("Product of digit is : "+prodOfDigit);
	}
}
