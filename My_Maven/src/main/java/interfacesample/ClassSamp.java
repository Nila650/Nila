package interfacesample;

public class ClassSamp implements IntSamp{
	
		
	public  void exam()
	{
		System.out.println("hila");
	}
public void show()
{
	System.out.println("exam");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSamp ob=new ClassSamp();
		ob.exam();
		System.out.println(IntSamp.t);
	//	ob.show();
	}

}
