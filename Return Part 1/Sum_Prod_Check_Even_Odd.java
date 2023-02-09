import java.util.Scanner;
class Sum_Prod_Check_Even_Odd 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int num = s.nextInt();

		int sum = AllMethod.sumOfDigit(num);
		int prod =AllMethod.prodOfDigit(num);
		System.out.println(sum);
		System.out.println(prod);

		if (sum%2==0 && (prod/2)*2==prod)
		{
			System.out.println("sum ans prod is even ");
		}else if ((sum/2)*2==sum && prod%2==1)
		{
			System.out.println("sum is even and prod is odd");
		}else if ((sum/2)*2!=sum && prod%2==0)
		{
			System.out.println("sum is Odd and prod is Even");
		}else
		{
			System.out.println("sum and prod is odd");
		}
	}
}
