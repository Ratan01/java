
import java.util.*;
public class Pattern_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int alpha=65;
		sc.close();
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
					System.out.print((char)(alpha)+"");
			}
			alpha++;
			System.out.println();
		}
	}
}
