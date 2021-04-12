
import java.util.*;
public class DecToHexa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		String rs = Dh(n);
		System.out.println(rs);
	}
	static String Dh(int n) {
		String hex=" ";
		do {
			int r= n%16;
			if(r<10)
				hex = r+hex;
			else if(r==10)
				hex = 'A'+hex;
			else if(r==11)
				hex = 'B'+hex;
			else if(r==12)
				hex = 'C'+hex;
			else if(r==13)
				hex = 'D'+hex;
			else if(r==14)
				hex = 'E'+hex;
			else if(r==15)
				hex = 'F'+hex;
			n=n/16;
		}
		while(n!=0);
		return hex;
	}

}
