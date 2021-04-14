
import java.util.*;
public class Pattern_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
					if(i==j||i+j-1==n) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
					}
			}
			System.out.println();
		}
	}

}
