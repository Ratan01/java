package d10_04;
import java.util.*;
public class Count_Letter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int uc=0, lc=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90) {
				uc++;
			}
			else if(ch>=97 && ch<=122) {
				lc++;
			}
		}
		System.out.println("Capital Letter: "+uc);
		System.out.println("Small Letter: "+lc);
	}

}
