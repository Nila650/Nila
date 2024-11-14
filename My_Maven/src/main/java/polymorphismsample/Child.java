package polymorphismsample;

public class Child extends Parent {

	@Override
	public void display()
	{
		super.display();
		System.out.println("method in child class");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ob=new Child();
		ob.display();
	
		//Parent ob1=new Parent();
		//ob1.display();
		
	}

}
