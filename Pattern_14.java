
import java.util.*;
public class Pattern_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		sc.close();
		int k=1;                                              //alter
		for(int i=1; i<=n; i++) {                             //System.out.print(k);
			for(int j=1; j<=n; j++) {                         //k++;
				System.out.print(k%9);                        //if(k==10) k=1;;
				k++;
			}
			System.out.println();
		}
	}
}
