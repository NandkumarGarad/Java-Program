package numberProgram;

import java.util.Scanner;

public class DiseriumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int ip = sc.nextInt();
		if(isDiseriumNumber(ip)) {
			System.out.println(ip+" is a Diserium Number");
		}else {
			System.out.println(ip+" is Not a Diserium Number");
		}
		sc.close();
	}
	
	public static boolean isDiseriumNumber(int n) {
		int num =n;
		int sum =0;
		int ct =ArmStriomgNumber.countOfDigit(n);
		while(n!=0) {
			int rem = n%10;
			sum+=ArmStriomgNumber.power(rem,ct--);
			n/=10;
		}
		if(num==sum) {
			return true;
		}else{
			return false;
		}

	}
}
