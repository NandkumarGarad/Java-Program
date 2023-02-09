import java.util.Scanner;
class Factor 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the  number : ");
		int ip = s.nextInt();

		for (int i= 1; i<=ip ; i++ )
		{
			if (ip%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
