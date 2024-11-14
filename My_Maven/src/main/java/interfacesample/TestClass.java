package interfacesample;

public class TestClass implements TestInterface {

	public void print() {
		System.out.println("method of class");
	}
	
	public void display()
	{
		System.out.println("first method of interface");
	}
	public void show()
	{
		System.out.println("second method of interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass ob=new TestClass();
		ob.display();
		ob.show();
		ob.print();
		TestInterface ob1=new TestClass();
		ob1.display();
		ob1.show();
		//ob1.print();
	}

}
