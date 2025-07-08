package Oops;

public class Question1 {

	public static void main(String[] args) {
		Box b=new Box(10,20,30);
		b.Volume();
		

	}

}
class Box{
	float width;
	float height;
	float depth;
	public Box(float width, float height,float depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
public float Volume() {
	float volume=width*height*depth;
	System.out.println("The volume of the Box is " +volume);
	return volume;
	
	
	
}
	
}
