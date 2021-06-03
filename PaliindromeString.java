
import java.util.*;
public class PaliindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1=sc.nextLine();
		sc.close();
		Boolean b=IsPalindrome(s1);
		if(b==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	static Boolean IsPalindrome(String st) {
		int i=0, j=st.length()-1;
		while(i<j) {
			if(st.charAt(i)!=st.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
