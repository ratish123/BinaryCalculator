
 public class ExponentBinaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=123456789, exponent = 123456789;
		long result=1;
		while (exponent !=0)
		{
			result *=base;
			--exponent;
		}
		System.out.println("Answer= "+ result);
		System.out.println("\n");
		bin(result);
	}
	
	static void bin(long n)
	{
		if (n > 1)
		bin(n >> 1);
		System.out.printf("%d", n & 1);
	}

}
