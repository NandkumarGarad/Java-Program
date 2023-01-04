class NarrowingFloat 
{
	public static void main(String[] args) 
	{
		
		float f =97.14f;       // 4 byte

		long l =(long) f;
		System.out.println(l);

		int i =(int) f;
		System.out.println(i);

		short s =(short) f;
		System.out.println(s);

		byte b =(byte) f;
		System.out.println(b);

		char ch =(char) f;
		System.out.println(ch);


		double d =(double) f;
	    System.out.println(d);

		 

	}
}
