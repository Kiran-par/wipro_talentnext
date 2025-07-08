package Oops;

public class Question3 {

	public static void main(String[] args) {
		Book b=new Book("Miles of Life",new Author("Kiran","venkatakiran42@gmail.com",'M'),599,4);
		b.getname();
		b.getauthor();
		b.getprice();
		b.getqutyInStock();
	}

}
class Author{
	 String name;
	String email;
	char gender;
	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
		
		
		
		
		
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qutyInStock;
	public  Book(String name, Author author, double price, int qutyInStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qutyInStock=qutyInStock;
	}
		public void setname(String name) {
			this.name=name;
		}
		public void setauthor(String name) {
			this.name=name;
		}
		public void setprice(double price) {
			this.price=price;
		}
		public void setqutyInStock(int qutyInStock) {
			this.qutyInStock=qutyInStock;
		}
		public void getname() {
			System.out.println(name);
		}
		public void getauthor() {
			System.out.println(author.name);
		}
		public void getprice() {
			System.out.println(price);
		}
		public void getqutyInStock() {
			System.out.println(qutyInStock);
		}
		
}
