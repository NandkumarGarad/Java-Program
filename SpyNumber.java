import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int N = S.nextInt();
		
		for (int i=1;i<=N ;i++ )
		{
			int sum = 0; 
		    int prod= 1; 
			int num=i;
			while (num > 0)
			{
				 
				int rem = num % 10;

				sum = sum + rem;
                if (rem != 0);
                {
					prod = prod * rem;
                }
				 

				num = num / 10;
			}
			if (sum == prod)
			{
              System.out.println("It is Spy Number"+i);
			}
		//System.out.println("Sum is : "+sum);
		//System.out.println("Prod is : "+prod);

		// String ans = (sum == prod) ? "It is spy number " : "It is not a spy Number";

		// System.out.println(ans);
        }

		
		 

		 

	}
}
