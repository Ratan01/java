package d19_03;
import java.io.*;
public class EvenMon {
	public static void main(String[] args)throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the n number ");
		int n = Integer.parseInt(b.readLine());
	
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
}
