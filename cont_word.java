package d10_04;
import java.util.*;
public class cont_word {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int count=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch==' ') {
				count++;
				break;
			}
			
		}
		System.out.println("number of words: "+(count+1));
	}

}
