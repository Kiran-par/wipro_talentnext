import java.util.*;
public class ArrayQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		boolean found=false;
		int k=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				found=true;
				k=i;
			}
	}
		if(found) System.out.println(k);
		else{
			System.out.println(k);
		}

}
}
