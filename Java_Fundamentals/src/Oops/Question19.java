package Oops;
import java.util.*;
public class Question19 {
	String na="hello";
	String default_name="india";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question19 q=new Question19();
		Optional<String> n=Optional.ofNullable(q.na);
		System.out.print(n.orElse(q.default_name));
	}

}
