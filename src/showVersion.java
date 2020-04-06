import java.io.Console;
public class showVersion{
	public static void main (String [] args)
	{
		String ver=System.getProperty("java.version");
		String vendor=System.getProperty("java.vendor");
		System.out.println(ver);
		System.out.println(vendor);
	}
}
