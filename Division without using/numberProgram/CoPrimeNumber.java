package numberProgram;

public class CoPrimeNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int min = a<b?a:b;
		int i;
		for ( i = min; i > 0; i--) {
			if(a%i==0 && b%i==0) {
				break;
			}
		}
		if(i==1) {
			System.out.println(a+" and "+b+" is CoPrime Number");
		}else {
			System.out.println(a+" and "+b+" is Not CoPrime Number");			
		}
	}

}
