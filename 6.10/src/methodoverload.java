
public class methodoverload {
	public static void main(String[] args)
	{
		System.out.printf("Square of int 7 is %d%n", square(7));
		System.out.printf("Square of int 7.5 is %f%n", square(7.5));
	}
	public static int square(int intvalue)
	{
		System.out.printf("%ncalled square with the int arugemnt: %d%n", intvalue);
		return intvalue * intvalue;
	}
	public static double square(double dvalue)
	{
		System.out.printf("%ncalled square with the double arugemnt: %f%n", dvalue);
		return dvalue * dvalue;
	}
}
