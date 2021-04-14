
import java.util.*;
public class Pattern_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
