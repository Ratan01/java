
import java.util.*;
public class Pattern_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number r");
		int n= sc.nextInt();
		int a=1;
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
					System.out.print(a+" ");
					if(a<=8) {
						a++;
					}
					else {
						a=1;
					}
			}
			
			System.out.println();
		}
	}
}
