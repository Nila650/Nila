package polymorphismsample;

public class Rectangle extends Shape {

	
	public void display()
	{
		super.display();
		System.out.println("method in rectangle");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob=new Rectangle();
		ob.display();
	}

}
