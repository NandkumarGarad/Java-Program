class Infinty 
{
	public static void main(String[] args) 
	{
		//System.out.println(154/0) ; // RE: java.lang.ArithmeticException: / by zero       (154 int) and (0 int)

		System.out.println(10.99/0); // Infinty                                             (10.99 double and 0 int)

		System.out.println(-20.87/0); // -Infinty


		//System.out.println(0/0); // RE :java.lang.ArithmeticException: / by zero

		System.out.println(0/0.0); // NaN (Not a  Number)

		System.out.println(-0.0/0); // NaN
	}
}


/*   Arithmatic Exception
     1] it is runtime error not a compile time
	 2] it is only possible integral airthmatic but not floating integral arithmatic
	 3] only possible / and % operator

	 */