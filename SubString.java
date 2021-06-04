
import java.util.*;
public class SubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String: ");
		String s2=sc.nextLine();
		sc.close();
		Boolean b=IsSub(s1,s2);
		if(b==true) {
			System.out.println("Sub String");
		}
		else {
			System.out.println("Not a Sub String");
		}
	}
	static Boolean IsSub(String str, String sp) {
		if(sp.length()-1>str.length()-1) {
			return false;
		}
		else {
			char c1[]=str.toCharArray();
			char c2[]=sp.toCharArray();
			for(int i=0; i<c1.length; i++) {
				int j=0, k=i;
				while(j<c2.length && k<c1.length && c1[k]==c2[j]) {
					j++;
					k++;
				}
				if(j==c2.length) {
					return true;
				}
			}
			return false;
		}
	}
}
