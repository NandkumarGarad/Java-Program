import java.util.Scanner;
class RangeOfPower 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the base value : ");
		int base = s.nextInt();
		System.out.print("enter the range of number : ");
		int range=s.nextInt();
		
		for (int i=0 ; i<=range ; i++ )
		{
			int power = AllMethod.power(base,i);
			System.out.println(base+" raise to "+i+"  : "+power);
		}
	}
}
