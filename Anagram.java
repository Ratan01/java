
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String: ");
		String s2=sc.nextLine();
		sc.close();
		Boolean b=IsAnagram(s1,s2);
		if(b==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
	static int[] countFrequency(String st) {
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
		return count;
	}
	static Boolean IsAnagram(String s1, String s2) {
		int c1[]=countFrequency(s1);
		int c2[]=countFrequency(s2);
		for(int i=0; i<26; i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	}
}
