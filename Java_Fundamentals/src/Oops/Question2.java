package Oops;

public class Question2 {

	public static void main(String[] args) {
		Calculator.powerInt(2, 4);
		
		

	}

}
class Calculator{
	int num1;
	int num2;
	double num1d;
	double num2d;
	public static void powerInt(int num1,int num2) {
		int k=(int) Math.pow(num1,num2);
		System.out.println(k);
		
		
	}
public static void powerDouble(double num1, double num2) {
	double m=Math.pow(num1, num2);
	System.out.println(m);
	
}
}
