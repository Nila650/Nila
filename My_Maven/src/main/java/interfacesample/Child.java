package interfacesample;

public class Child implements InterfaceEg{

	
	public void  example()
	{
		System.out.println("nila");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InterfaceEg.a);
		Child ob=new Child();
		ob.example();
		ob.exam();
	}

	@Override
	public void exam() {
		// TODO Auto-generated method stub
		System.out.println("nil");
	}

}
