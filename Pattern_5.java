
import java.util.*;
public class Pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		sc.close();
		int i,j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(i%2!=0) {
					if(j%2!=0) {
						System.out.print(1+"");
					}
					else {
						System.out.print(0+"");
					}
				}
				else {
					if(j%2!=0) {
						System.out.print(0+"");
					}
					else {
						System.out.print(1+"");
					}
				}
			}
			System.out.println();
		}
	}
}
