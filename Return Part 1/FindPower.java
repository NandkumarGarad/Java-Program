import java.util.Scanner;
class FindPower 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the base value : ");
		int base = s.nextInt();

		System.out.print("Enter the raise value : ");
		int raise = s.nextInt();

		int power = AllMethod.power(base,raise);
		System.out.println(power);
		
	}
}
