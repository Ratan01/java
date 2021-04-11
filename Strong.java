package d24_03;
import java.util.*;
public class Strong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		Boolean rs = isStrong(n);
		if(rs==true) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
	}
	static Boolean isStrong(int x) {
		int sum=0, temp=x;
		do {
			int r = x%10;
			sum=sum+fact(r);
			x=x/10;
		}
		while(x!=0);
			return sum==temp;
	}
	static int fact(int n) {
		int f=1;
		while(n>1) {
			f=f*n;
			n--;
		}
		return f;
	}
}
