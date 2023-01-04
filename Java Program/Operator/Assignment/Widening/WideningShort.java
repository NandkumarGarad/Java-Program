class WideningShort 
{
	public static void main(String[] args) 
	{
		short s = 32767;                 // 2 byte

		int i = s;
		System.out.println(i); //32767   // 2 byte convert into 4 byte

		long l = s;
		System.out.println(l); //32767    // 2 byte convert into 8 byte

		float f = s;
		System.out.println(f); //32767.0    // 2 byte convert into 4 byte

		double d = s;
		System.out.println(d); //32767.0    // 2 byte convert into 8 byte

		//char ch = s;
		//System.out.println(i); //32767

		//boolean b2 = s;
		//System.out.println(b2); //32767
	}
}
