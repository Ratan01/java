package d17_03;
import java.util.*;
public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 12 for month name : ");
		int n=sc.nextInt();
		sc.close();
		switch(n) {
		case 1: System.out.println("Enter number 1 is January");
		break;
		case 2: System.out.println("Enter number 2 is Feburary");
		break;
		case 3: System.out.println("Enter number 3 is March");
		break;
		case 4: System.out.println("Enter number 4 is April");
		break;
		case 5: System.out.println("Enter number 5 is May");
		break;
		case 6: System.out.println("Enter number 6 is June");
		break;
		case 7: System.out.println("Enter number 7 is July");
		break;
		case 8: System.out.println("Enter number 8 is August");
		break;
		case 9: System.out.println("Enter number 9 is September");
		break;
		case 10: System.out.println("Enter number 10 is October");
		break;
		case 11: System.out.println("Enter number 11 is November");
		break;
		case 12: System.out.println("Enter number 12 is December");
		break;
		default :
			System.out.println("Enter number is invalid");
			break;
		}
		
	}
}
