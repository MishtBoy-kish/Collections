import java.util.Scanner;

public class Summa {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Limit : ");
		int n = in.nextInt();
		int [] a = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter A ["+i+"] Value : ");
			a[i]=in.nextInt();
		}
		
	}

}
