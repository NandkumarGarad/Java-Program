class WideningChar 
{
	public static void main(String[] args) 
	{
		char ch = 'O';                // 2 byte
		System.out.println(ch);

		//byte b = ch;                // 1 byte
		//System.out.println(b);

		//short s = ch;
		//System.out.println(s); 

		int i = ch;
		System.out.println(i);//79

		long l = ch;
		System.out.println(l);//79

		float f = ch;
		System.out.println(f);//79.0

		double d = ch;
		System.out.println(d);//79.0

	
	}
}
