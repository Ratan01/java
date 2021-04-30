
import java.util.*;
public class Inserting_other {
	public static void main(String[] args)
	{
		System.out.println("Read the first array");
		int a[]=readArray();
		display(a);
		System.out.println("Read the second array");
		int b[]=readArray();
		display(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index position you want to insert the array elements into another array:");
		int n=sc.nextInt();
		int c[]=arrayInsert(a,b,n);
		System.out.println("Another array after insert one array into another array");
		display(c);
		
	}

	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
		
	}
	static int[] arrayInsert(int[] a, int[] b, int n) 
	{
		if(n<0||n>a.length)
		{
			return a;
		}
		int c[] = new int[a.length+b.length];
		for(int i=0;i<b.length;i++)
		{
			c[n+i]=b[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i<n)
			{
				c[i]=a[i];
			}
			else
			{
				c[i+b.length]=a[i];
			}
		}
		return c;
	}
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the "+n+" elements in the array:");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;	
	}
}
