import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
	}

}