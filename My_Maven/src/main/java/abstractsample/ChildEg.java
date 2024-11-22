package abstractsample;

public class ChildEg extends Abstracteg1  {

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
        ChildEg ob=new ChildEg();
        ob.abstractname();
        //Abstracteg1 ob1=new ChildEg();
       // ob1.disp();
        ob.print();
	}

}
