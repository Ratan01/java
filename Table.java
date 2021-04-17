
import java.io.*;
public class Table {
	public static void main(String[] args)throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		int n = Integer.parseInt(b.readLine());
		System.out.println("Enter the range ");
		int range = Integer.parseInt(b.readLine());
		for(int i=1; i<=range; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
