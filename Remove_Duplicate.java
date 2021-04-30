
import java.util.*;
public class Remove_Duplicate {
	public static void main(String[] args) {
		System.out.println("read the first array: ");
		int x[]=read();
		System.out.println("Pritn the array element");
		disp(x);
		int z[]=duplicate(x);
		System.out.println("print the array after removing the element");
		disp(z);
	}
	static int[] read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements");
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static void disp(int r[]) {
		for(int i=0; i<r.length; i++) {
			System.out.print(r[i]);
			if(i<r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
	static int[] duplicate(int ar[]) {
		int br[]=new int[ar.length];
		int n=0;
		for(int i=0; i<ar.length; i++) {
			int j=0;
			while(j<n) {
				if(ar[i]==br[j]) {
					break;
				}
				j++;
			}
			if(j==n) {
				br[j]=ar[i];
				n++;
			}
		}
		int r[]=new int[n];
		for(int i=0; i<n; i++) {
			r[i]=br[i];
		}
		return r;
	}
}
