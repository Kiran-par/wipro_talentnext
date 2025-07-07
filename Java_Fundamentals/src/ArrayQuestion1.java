import java.util.*;
public class ArrayQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				sum+=arr[i];
			}
			
			
		double avg=sum/n;
		System.out.println(+sum);
		System.out.println(+avg);

	}

}
