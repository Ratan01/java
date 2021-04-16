
import java.util.*;
public class Pattern_Inverted_diamond_star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		sc.close();
		int i, j;
		for(i=n; i>=1; i--) {
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=2; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
