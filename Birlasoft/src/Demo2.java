import java.io.FileOutputStream;
public class Demo2 {
	
	public static void main(String args[]) {
		try {
			FileOutputStream fout= new FileOutputStream("D:\\testout.txt");
			String s="Welcome";
			byte b[]=s.getBytes();
			
			fout.write(b);
			fout.write(65);
			fout.close();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
