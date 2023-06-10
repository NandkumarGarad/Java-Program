package numberProgram;

public class TwinPrime {
	public static void main(String[] args) {
		int n1 = 17, n2 = 15;
		if (n1 - n2 == 2 || n2 - n1 == 2) {
			if (CircularPrimeProgram.isPrime(n1)) {
				if (CircularPrimeProgram.isPrime(n2)) {
					System.out.println(n1+" and +"+n2+" is a Twin Prime Number.");
				} else {
					System.out.println(n1+" and +"+n2+" is Not a Twin Prime Number.");
				}
			} else {
				System.out.println(n1+" and +"+n2+" is Not a Twin Prime Number.");
			}
		}else {
			System.out.println(n1+" and +"+n2+" is Not a Twin Prime Number");			
		}
	}
}
