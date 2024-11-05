package abstractsample;

public class Child extends Abstracteg1  {

	public void abstractname()
	{
		System.out.println("abstractmethod");//implementation
	}
	
	
	public void print()
	{
		System.out.println("child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Child ob=new Child();
        //ob.abstractname();
        Abstracteg1 ob1=new Child();
        ob1.disp();
       // ob1.print();
	}

}
