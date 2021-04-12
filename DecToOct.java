
import java.util.*;
public class DecToOct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		String rs = Doo(n);
		System.out.println(rs);
	}
	static String Doo(int n) {
		String oct=" ";
		do {
			int r= n%8;
			oct = r+oct;
			n = n/8;
		}
		while(n!=0);
		return oct;
	}
}
