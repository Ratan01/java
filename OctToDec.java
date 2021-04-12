
import java.util.*;
public class OctToDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		int rs = Dh(n);
		System.out.println(rs);
	}
	static int Dh(int n) {
		int oct=0, p=1;
		do {
			int r= n%10;
			oct=oct+r*p;
			p=p*8;
			n=n/10;
		}
		while(n!=0);
		return oct;
	}

}
