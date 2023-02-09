import java.util.Scanner;
class RangeOfPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the Staring Number : ");
		int start = s.nextInt();
		System.out.print("Enter the Ending Number : ");
		int end = s.nextInt();

		for (int i=start ; i<=end ; i++ )
		{
			int rev = AllMethod.revNumber(i);
			if (i==rev)
			{
				System.out.println( i+ " It is Palindrome Number.");
			}
		}
	}
}
