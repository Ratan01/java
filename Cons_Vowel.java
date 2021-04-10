package d10_04;
import java.util.*;
public class Cons_Vowel {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int vowel=0, conso=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85 || ch==97 || ch==101 || ch==105 || ch==111 || ch==117) {
				vowel++;
			}
			else {
				if(ch>=32 && ch<=64 || ch>=91 && ch<=96) {
				
				}
				else {
					conso++;
				}
			}
		}
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonants: "+conso);
	}

}
