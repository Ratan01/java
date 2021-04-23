
import java.util.*;
public class Merge {
	static int[] read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements");
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
	static int[] merging(int a[], int b[]) {
		int c[]=new int[a.length + b.length];
		for(int i=0;i<a.length; i++) {
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("read the first array: ");
		int x[]=read();
		System.out.println("read the second array: ");
		int y[]=read();
		System.out.println("entered first array: ");
		disp(x);
		System.out.println("enetred second array: ");
		disp(y);
		System.out.println("After merge: ");
		int z[]=merging(x,y);
		disp(z);
	}
}
