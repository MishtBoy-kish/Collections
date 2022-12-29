import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
    int a[][] = new int[8][8];
    int  i,j,left=0,rigtht=0;
    int n = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Matrix Elements : ");
    n=in.nextInt();
    
    for(i=0;i<n;i++) {
    	for(j=0;j<n;j++) {
    		System.out.print("Enter Matrix Elements  ["+i+"]["+j+"]");
    		a[i][j] = in.nextInt();
    	}
    }
    
    System.out.println("Matrix Is .....");
    for(i=0;i<n;i++) {
    	for(j=0;j<n;j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    	}
    
    for(i=0;i<n;i+=2) {
    	for(j=0;j<n;j++) {
    		if(i==j) {
    			left=left+a[i][j];
    		}
    		if(i+j==n-1) {
    			rigtht=rigtht+a[i][j];
    		}
    	}
    	
      	}
   
    System.out.println("Sum Of Right Diagonal = "+left+" Sum Of Left Diagonal = "+rigtht);
    System.out.println("Difference : "+(left-rigtht));
	}

}

