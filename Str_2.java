package d01_04;
import java.util.*;
public class Str_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String s= sc.next();
		int n=s.length();
		sc.close();
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(s.charAt(i-1)+" ");
			}
			System.out.println();
		}
	}

}
