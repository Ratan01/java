
import java.util.*;
public class Happy_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Boolean rs = isHappy(n);
		if(rs==true) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not a Happy Number");
		}
	}
	static Boolean isHappy(int n) {
		while(n>1) {
			int sum=0;
			do {
				int r=n%10;
				sum=sum+(r*r);
				n=n/10;
			}
			while(n!=0);
			n=sum;
		}
		return n==1||n==7;
	}
}
