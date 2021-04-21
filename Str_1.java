
import java.util.*;
public class Str_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String s= sc.next();
		int n=s.length();
		sc.close();
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
