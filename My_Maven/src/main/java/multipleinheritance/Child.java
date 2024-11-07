package multipleinheritance;

public class Child implements ParentOne,ParentTwo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Child ob=new Child();
			//ob.print();
		//	ob.display();
		ParentOne ob=new Child();
		ob.display();
		ParentTwo ob1=new Child();
		ob1.print();
			
	}

	/*@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("nila");
	}*/

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("aami");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("nila");
	}

	
	}


