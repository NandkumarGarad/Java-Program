class NarrowingInt 
{
	public static void main(String[] args) 
	{
		int i = 111;

		short s = (short) i;
		System.out.println(s);

		byte b = (byte) i;
		System.out.println(b);

		char ch = (char) i;
		System.out.println(ch);
	}
}
