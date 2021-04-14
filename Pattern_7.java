
import java.util.*;
import java.util.Scanner;

public class Pattern_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		char alpha=65;
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
					System.out.print((alpha)+" ");
					alpha++;
			}
			System.out.println();
		}
	}

}
