
import java.util.*;
public class Even_Odd {
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
		int a[]=countEo(ar);
		System.out.println("number of even element is: "+a[0]);
		System.out.println("number of odd element is: "+a[1]);
	}
	static int[] countEo(int x[]) {
		int ec=0, oc=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]%2==0) {
				ec++;
			}
			else {
				oc++;
			}
		}
		int count[]= {ec,oc};
		return count;
	}
}
