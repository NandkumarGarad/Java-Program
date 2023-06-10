package numberProgram;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  ");

		int num = sc.nextInt();
		int sum = sumAndSquareOfDigit(num);
		while(sum>9) {
			sum=sumAndSquareOfDigit(sum);
		}
		if(sum==1) {
			System.out.println(num+" is Happy number.");
		}else {
			System.out.println(num+" is Not Happy number.");			
		}
		sc.close();
	}

	public static int sumAndSquareOfDigit(int n) {
		 
			int sum =0;
			while (n != 0) {
				int rem = n % 10;
				sum += ArmStriomgNumber.power(rem, 2);
				n /= 10;
			}
		return sum;
	}
}
