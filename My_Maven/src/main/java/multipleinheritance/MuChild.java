package multipleinheritance;

public class MuChild implements MuParent1,MuParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MuChild ob=new MuChild();
		//MuParent1 ob=new MuChild();
		MuParent2 ob=new MuChild();
		//ob.display();
		ob.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

}
