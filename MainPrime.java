package d24_03;
import java.util.*;
public class MainPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Boolean rs = isPrime(n);
		if(rs==true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}
	static Boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

