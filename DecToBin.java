
import java.util.*;
public class DecToBin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		String rs = Db(n);
		System.out.println(rs);
	}
	static String Db(int dec) {
		String bin=" ";
		do {
			int r = dec%2;
			bin = r+bin;
			dec=dec/2;
		}
		while(dec!=0);
		return bin;
	}
}
