package numberProgram;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String ip = sc.next();
		int l1 = ip.length();
		int num = Integer.parseInt(ip);
		int l2 =ArmStriomgNumber.countOfDigit(num);
		
		if(l1!=l2) {
			System.out.println(ip+" is Not Duck Number");
		}else {
			if(isDuck(num)) {
				System.out.println(ip+" is Duck Number");
			}else
			{
				System.out.println(ip+" is Not Duck Number");
			}
		}
		sc.close();
	}
	public static boolean isDuck(int n) {
		while(n!=0) {
			int rem = n%10;
			if(rem==0) {
				return true;
			}
			n/=10;
		}
		return false;
	}
}
