package d18_03;
import java.io.*;
public class Mid {
	public static void main(String[] args)throws IOException {
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number a");
		int a = Integer.parseInt(i.readLine());
		System.out.println("Enter the number b");
		int b = Integer.parseInt(i.readLine());
		System.out.println("Enter the number c");
		int c = Integer.parseInt(i.readLine());
		if(b>a && a>c || c>a && a>b) 
		    System.out.println("The middle number is "+a);
		else if(a>b && b>c || c>b && b>a) 
		    System.out.println("The middle number is "+b); 
		else
		    System.out.println("The middle number is "+c);
	}

}
