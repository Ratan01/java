
import java.util.*;
public class AlphaCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String st=sc.nextLine();
		int c[]=new int[26];
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z') {
				c[ch-65]++;
			}
			else if(ch>='a'&&ch<='z') {
				c[ch-97]++;
			}
		}
		for(int i=0; i<c.length; i++) {
			if(c[i]!=0) {
				System.out.println((char)(i+65)+"--->"+c[i]);
			}
		}
	}
}
