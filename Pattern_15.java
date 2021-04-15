
import java.util.*;
public class Pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int k=1;
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(k%2);
				k++;
			}
			System.out.println();
		}
	}


}
