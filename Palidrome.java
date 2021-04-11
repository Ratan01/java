package d24_03;
import java.util.*;
public class Palidrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		Boolean rs = isPalidrome(n);
		if(rs==true) {
			System.out.println("Palidrome Number");
		}
		else {
			System.out.println("Not a Palidrome Number");
		}
	}
	static Boolean isPalidrome(int x) {
		return x== reverse(x);
	}
	static int reverse(int no) {
		int rev=0;
		do {
			int r=  no%10;
			rev=rev*10+r;
			no=no/10;
		}
		while(no!=0);
		return rev;
	}
}
