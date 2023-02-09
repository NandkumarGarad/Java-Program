import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = s.nextInt();//13
		int count =0;
		boolean flag = true;
		int i;
                    //13<=13
		for ( i=2 ;  i<=num/2 ; i++ )
		{
			   //12%2==0
			if (num%i==0)
			{
				//System.out.println("It is Not Prime Number : "+num);
				flag =false;
				//count++;
				break;
			}
		}

		if (flag==true)
		{
				System.out.println("It is Prime Number : "+num);
				return;
		}
				System.out.println("It is Not Prime Number : "+num);
	}
}
