package numberProgram;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum = sumOfDigit(n);
		if(n%sum==0) {
			System.out.println(n+" is Harshad Number");
		}else {
			System.out.println(n+" is Not Harshad Number");
		}
		
		sc.close();
	}

	public static int sumOfDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}
}
