/*

A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.


Enter the Number : 1457
1457It is Not Spy Number.


Enter the Number : 123
123 It is Spy Number.

*/

import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.print("Enter the Number : ");
		int ip = s.nextInt();

		int sum = AllMethod.sumOfDigit(ip);
		int prod = AllMethod.prodOfDigit(ip);

		if (sum == prod)
		{
			System.out.println(ip+ " It is Spy Number.");
			return ;
		}
		System.out.println(ip+" It is Not Spy Number.");
	}
}
