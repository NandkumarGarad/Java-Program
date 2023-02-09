import java.util.Scanner;
class RangeOfSpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the starting Number : ");
		int start = s.nextInt();

		System.out.print("Enter the ending Number : ");
		int end = s.nextInt();


		for (int i=start ; i<=end ; i++ )
		{
			int sum = AllMethod.sumOfDigit(i);
			int prod = AllMethod.prodOfDigit(i);
			
			if (sum == prod)
			{
				System.out.println(i+ "  is Spy Number. ");
			}
		}
	}
}
