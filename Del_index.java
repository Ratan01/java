
import java.util.*;
public class Del_index {
	public static void main(String[] args) {
		System.out.println("read the first array: ");
		int x[]=read();
		System.out.println("entered first array: ");
		disp(x);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index which want to delete");
		int y=sc.nextInt();
		int z[]=deletarrays(x,y);
		disp(z);
	}
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
	static int[] deletarrays(int x[], int in) {
		if(in< 0 || in>=x.length) {
			System.out.println("deletion is not poassible");
			return x;
		}
		int z[]=new int[x.length-1];
		for(int i=0; i<z.length; i++) {
			if(i<in) {
				z[i]=x[i];
			}
			else {
				z[i]=x[i+1];
			}
		}
		return z;
	}
}
