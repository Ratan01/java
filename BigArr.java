package d06_04;
import java.util.*;
public class Biggest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Eneter the "+n+" elements");
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		int big=getBiggest(ar);
		System.out.println("Biggest nuber is: "+big);
	}
	static int getBiggest(int n[]) {
		int big=n[0];
		for(int i=1; i<n.length; i++) {
			if(big<n[i]) {
				big=n[i];
			}
		}
		return big;
	}
}
