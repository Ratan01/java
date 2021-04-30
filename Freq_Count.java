
import java.util.*;
public class Freq_Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" element");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			int count=1;
			for(int j=i+1; j<size; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=arr[size-1];
					size--;
					j--;
				}
			}
			System.out.println(arr[i]+"->"+count);
		}
	}

}
