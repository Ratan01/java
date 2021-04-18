
import java.util.*;
public class Pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			int k=i;
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k=k+n-j;
			}
			System.out.println();
		}
	}

}
