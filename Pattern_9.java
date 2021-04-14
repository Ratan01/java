
import java.util.*;
public class Pattern_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
