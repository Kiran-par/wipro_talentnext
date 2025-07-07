import java.util.*;
public class ArrayQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
				
			}
			else if(arr[i]<min2 && arr[i]!=min1) {
				min2=arr[i];
			}
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
			}
		}
		System.out.println("The largest two numbers are" +min1+" "+min2);
		System.out.println("The smallest two numbers are" +max1+" "+max2);

	}

}
