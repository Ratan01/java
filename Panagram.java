
import java.util.*;
public class Panagram {
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
		int count[]=new int[26];
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z') {
				count[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				count[ch-97]++;
			}
		}
		for(int i=0; i<26; i++) {
			if(count[i]==0) {
				return false;
			}
		}
		return true;
	}
}
