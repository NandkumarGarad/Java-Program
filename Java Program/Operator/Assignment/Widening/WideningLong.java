class WideningLong 
{
	public static void main(String[] args) 
	{
		long l = 878;            // 8 byte

		float f = l;
		System.out.println(f);    // 4 byte

		double d = l;
		System.out.println(d);    // 8 byte

	}
}
