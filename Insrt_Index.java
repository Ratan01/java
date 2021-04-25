
import java.util.*;
public class Insrt_Index {
	public static void main(String[] args) {
		System.out.println("read the first array: ");
		int x[]=read();
		System.out.println("entered first array: ");
		disp(x);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index at which want to insert");
		int y=sc.nextInt();
		System.out.println("enetr the element which you want to insert");
		int r=sc.nextInt();
		int z[]=insertarrays(x,y,r);
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
	static int[] insertarrays(int x[], int in, int ele) {
		if(in< 0 || in>=x.length) {
			System.out.println("deletion is not poassible");
			return x;
		}
		int z[]=new int[x.length+1];
		z[in]=ele;
		for(int i=0; i<x.length; i++) {
			if(i<in) {
				z[i]=x[i];
			}
			else {
				z[i+1]=x[i];
			}
		}
		return z;
	}

}
