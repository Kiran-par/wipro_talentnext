import java.util.*;
public class ArrayQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int[] arr=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=s.nextInt();
		 }
		 int min=arr[0];
		 int max=arr[0];
		 for(int i=0;i<n;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }

		 System.out.println("The min value of array" +min);
		 System.out.println("The max value of array" +max);
		 
		
		
}
}


	
