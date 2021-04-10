package d10_04;
import java.util.*;
public class Count_Letter_Str_Arr {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int uc=0, lc=0;
		char ch[]=st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				uc++;
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				lc++;
			}
		}
		System.out.println("Capital Letter: "+uc);
		System.out.println("Small Letter: "+lc);
	}

}
