package polymorphismsample;

public class Child1 extends Parent1 {

	public void print()
	{
		super.print();
		System.out.println("child method");
	}
	
	
	
	
	public static void main(String args[])
	{
		Child1 ob=new Child1();
		ob.print();
	}
}
