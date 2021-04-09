package d19_03;
import java.io.*;
public class CountDigit {
	public static void main(String[] args)throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		int n = Integer.parseInt(b.readLine());
		int dig=0;
		int t=n;
		while(t>0) {
			dig++;
			t=t/10;
		}
		System.out.println(dig);
	}

}
