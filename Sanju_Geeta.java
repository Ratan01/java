package d18_03;
import java.io.*;
public class Sanju_Geeta {
	public static void main(String[] args)throws IOException{
		BufferedReader i= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n = Integer.parseInt(i.readLine());
		if((n>=0)&&(n<=9)) {
			if(n%3==0) {
				System.out.println("SANJU");
			}
			else if(n%5==0) {
				System.out.println("GEETA");
			}
			else {
				System.out.println("Invalid");
			}
		}
		else {
			if(n%15==0) {
				System.out.println("SANJU WEDS GEETA");
			}
			else if(n%3==0) {
				System.out.println("SANJU");
				}
			else if(n%5==0) {
			    System.out.println("GEETA");
			}
			else {
			    System.out.println("Invalid");
			    }
			}
	}
}
