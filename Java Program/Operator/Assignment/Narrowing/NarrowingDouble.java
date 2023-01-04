class NarrowingDouble 
{
	public static void main(String[] args) 
	{
		double d =14.14;   // 8 byte

		float f =(float) d;       // 4 byte
		System.out.println(f); 

		long l =(long) d;
		System.out.println(l);

		int i =(int) d;
		System.out.println(i);

		short s =(short) d;
		System.out.println(s);

		byte b =(byte) d;
		System.out.println(b);

		char ch =(char) d;
		System.out.println(ch);

		 

	}
}
