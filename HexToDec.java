
import java.util.*;
public class HexToDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		int rs = Dh(n);
		System.out.println(rs);
	}
	static int Dh(int n) {
		int hex=0, p=1;
		do {
			int r= n%10;
			hex=hex+r*p;
			p=p*16;
			n=n/10;
		}
		while(n!=0);
		return hex;
	}

}
