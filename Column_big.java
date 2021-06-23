
import java.util.*;
public class Column_big {
	public static void main(String[] args) {
		System.out.println("read first matrix");
		int a[][]=readmat();
		System.out.println("display matrix");
		dispmat(a);
		int[] c=colbig(a);
		System.out.println("biggest element column wise in a matris is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
			if(i<c.length-1)
			{
				System.out.print(",");
			}
		}
		
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
	static int[] colbig(int mat[][]) {
		int big[]=new int[mat[0].length];
		for(int i=0; i<mat[0].length; i++) {
			big[i]=mat[0][i];
			for(int j=0; j<mat.length; j++) {
				if(big[i]<mat[j][i]) {
					big[i]=mat[j][i];
				}
			}
		}
		return big;
	}


}
