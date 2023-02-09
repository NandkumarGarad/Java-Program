import java.util.Scanner;
class Pade 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the base : ");
		int base = s.nextInt();

		for (int i=1; i<=10 ; i++ )
		{
			int ans = i*base;
			System.out.println(base+" * "+i+" = "+ans);
		}
	}
}
