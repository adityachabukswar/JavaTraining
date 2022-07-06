
public class Excpt2 {

	public static void main(String[] args) {
		int[]a1= {10,20,30};
		try {
			int b=(10+20+30)/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("exception1 is been handelled");
		}
		try
		{
			System.out.println(a1[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("exception2 is been handelled");
		}
	}
}
