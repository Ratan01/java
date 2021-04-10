package d10_04;
import java.util.*;
public class Alpha_Spl_Digi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int alpha=0, dig=0, spl=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)) {
				alpha++;
			}
			else if(ch>=48 && ch<=57) {
				dig++;
			}
			else {
				spl++;
			}
		}
		System.out.println("Alphabets: "+alpha);
		System.out.println("Digits: "+dig);
		System.out.println("Special Character: "+spl);
	}
}
