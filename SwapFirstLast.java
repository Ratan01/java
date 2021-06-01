
import java.util.*;
public class SwapFirstLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int f=0;
		for(int i=0; i<ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				f=i;
			}
			if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') 
			{
				char t=ch[f];
				ch[f]=ch[i];
				ch[i]=t;
			}
		}
		st=new String(ch);
		System.out.println(st);
	}
}
