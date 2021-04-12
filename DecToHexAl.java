
import java.util.*;
public class DecToHexAl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		String rs = Dh(n);
		System.out.println(rs);
	}
	static String Dh(int n) {
		String hex=" ";
		do {
			int r= n%16;
			if(r<10)
				hex = r+hex;
			else
				hex=(char)(r+55)+hex;
			n=n/16;
		}
		while(n!=0);
		return hex;
	}
}
