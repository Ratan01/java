
import java.util.*;
public class Bigg_Matrix 
{
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
	void dispmat(int mat[][])
	{
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++) 
			{
				System.out.println(mat[i][j]+" ");
			}
		}
		System.out.println();
	}
	public int getbiggest(int mat[][])
	{
		int big=mat[0][0];
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++) 
			{
				if(mat[i][j]>big)
				{
					big=mat[i][j];
				}
			}
		}
		return big;
	}
}




public class Bigg_Matrix_Test {
	public static void main(String[] args) {
		Bigg_Matrix m=new Bigg_Matrix();
		System.out.println("read the matrix: ");
		int x[][]=m.readmat();
		System.out.println("user entered matrix; ");
		m.dispmat(x);
		System.out.println("biggest element in the matrix is "+m.getbiggest(x));
	}
}
