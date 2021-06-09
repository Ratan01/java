
import java.util.*;
public class Add_Matrix {
	public static void main(String[] args) {
		System.out.println("read first matrix");
		int a[][]=readmat();
		System.out.println("read second matrix");
		int b[][]=readmat();
		System.out.println("display first matrix");
		dispmat(a);
		System.out.println("display second matrix");
		dispmat(b);
		int c[][]=addmat(a,b);
		System.out.println("addition of two matris is: ");
		dispmat(c);
	}
	static int[][] readmat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column of the matrix: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter the "+r*c+ " element row wise");
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	static void dispmat(int mat[][])
	{
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] addmat(int a[][], int b[][]){
		if(a.length!=b.length ||  a[0].length!=b[0].length) {
			System.out.println("order must be same");
			return null;
		}
		int c[][]=new int[a.length][a[0].length];
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
