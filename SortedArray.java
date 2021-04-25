
import java.util.*;
public class SortedArray {
	public static void main(String[] args) {
		System.out.println("read the first array: ");
		int x[]=read();
		System.out.println("read the second array: ");
		int y[]=read();
		System.out.println("entered first array: ");
		disp(x);
		System.out.println("enetred second array: ");
		disp(y);
		System.out.println("After sorted: ");
		int z[]=arrays(x,y);
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
	static int[] arrays(int x[], int y[]) {
		int z[] = new int[x.length + y.length];
		int i=0, j=0, k=0;
		while(i<x.length && j<y.length) {
			if(x[i]<y[j]) {
				z[k]=x[i];
				i++;
			}
			else {
				z[k]=y[j];
				j++;
			}
			k++;
		}
		while(i<x.length) {
			z[k]=x[i];
			k++;
			i++;
		}
		while(j<y.length) {
			z[k]=y[j];
			k++;
			j++;
		}
		return z;
	}
}
