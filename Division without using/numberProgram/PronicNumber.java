package numberProgram;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int ip = sc.nextInt();
		if(isPronic(ip)) {
			System.out.println(ip+" Is a Pronic Number.");
		}else {
			System.out.println(ip+" Is a Not Pronic Number.");			
		}
		sc.close();
	}
	public static boolean isPronic(int k){
		int a=1,b=2,c;
		while(true) {
			c =a*b;
			if(c==k) {
				return true;
			}else if(c>k) {
				return false;
			}else {
				a++;
				b++;
			}
		}
	}
}
