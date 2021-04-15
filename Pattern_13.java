
import java.util.*;
public class Pattern_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1; j--) {
				if(j%2!=0) {
					System.out.print(1);
				}
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

}
