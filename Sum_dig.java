package d10_04;
import java.util.*;
public class Sum_dig {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int sum=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>=48 && ch<=57) {
				sum=sum+ch-48;
			}
		}
		System.out.println("sum of digit in string: "+sum);
	}
}
