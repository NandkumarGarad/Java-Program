import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the first Number : ");
		int a = s.nextInt();

		System.out.print("Enter the second Number : ");
		int b = s.nextInt();

		int max = AllMethod.maxOfTwo(a,b);

		for (int i=max ; true ; i++ )
		{
			if (i%a==0 && i%b==0)
			{
				System.out.println("L. C. M. is : "+i);
				break;
			}
			
		}

		
	}
}
