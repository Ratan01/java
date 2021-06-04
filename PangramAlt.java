
import java.util.*;
public class PangramAlt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String n=sc.nextLine();
		sc.close();
		Boolean rs= IsPangram(n);
		if(rs==true) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not a Panagram");
		}
	}
	static Boolean IsPangram(String st) {
		if(st.length()<26) {
			return false;
		}
		for(char c1='A', c2='a'; c1<='Z'; c1++, c2++) {
			if(st.indexOf(c1)==-1 && st.indexOf(c2)==-1) {
				return false;
			}
		}
		return true;
	}
}
