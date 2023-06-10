package numberProgram;

import java.util.Scanner;

public class ArmStriomgNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int ip = sc.nextInt();
		int ct = countOfDigit(ip);
		if(ip==isArmStrong(ip,ct)) {
			System.out.println(ip+" is ArmStrong Number.");
		}else {
			System.out.println(ip+" is Not ArmStrong Number.");
		}
		sc.close(); 
	}
	public static int isArmStrong(int n ,int ct) {
		int sum =0;
		while(n>0) {
			int rem = n%10;
			sum+=power(rem,ct  );
			n/=10;
		}
		return sum;
	}
	public static int countOfDigit(int n) {
		int ct =0;
		while(n>0) {
			ct++;
			n/=10;
		}
		return ct;
	}
	
	public static int power(int base,int raise) {
		int pow =1;
		for(int i=0;i<raise;i++) {
			pow*=base;
		}
		return pow;
	}
}
