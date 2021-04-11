package d24_03;
import java.util.*;
public class Diseriun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Boolean rs = isDiseriun(n);
		if(rs==true) {
			System.out.println("diseriun Number");
		}
		else {
			System.out.println("Not a Diseriun Number");
		}
	}
	static Boolean isDiseriun(int x) {
		int dc = countDigit(x);
		int sum=0, temp=x;
		do {
			int r=x%10;
			sum=sum+pow(r,dc);
			dc--;
			x=x/10;
		}
		while(x!=0);
		return sum==temp;
	}
	static int countDigit(int x) {
		int count=0;
		do {
			count++;
			x=x/10;
		}
		while(x!=0);
		return count;
	}
	static int pow(int n, int p) {
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
