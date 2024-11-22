package polymorphismsample;

public class Circle extends Shape {

	public void display()
	{
		super.display();
		System.out.println("method in circle");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ob=new Circle();
		ob.display();
	}

}
