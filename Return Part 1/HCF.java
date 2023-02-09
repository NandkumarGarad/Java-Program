import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		int x = s.nextInt();

		System.out.print("Enter the value of y : ");
		int y = s.nextInt();
		
		int min = AllMethod.minOfTwo(x,y);
		for (int i=min/2 ; min>0 ; i-- )
		{
			if (x%i==0 && y%i==0)
			{
				System.out.println("H.C.F :"+i);
				break;
			}
		}
	}
}
