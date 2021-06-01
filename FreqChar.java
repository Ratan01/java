
import java.util.*;
public class FreqChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String st=sc.nextLine();
		int c[]=new int[128];
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			c[ch]++;
		}
		for(int i=0; i<c.length; i++) {
			if(c[i]!=0) {
				System.out.println((char)i+"--->"+c[i]);
			}
		}
	}
}


