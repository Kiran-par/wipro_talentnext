import java.util.*;
public class ArrayQuestion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
	     Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));

	}

}
