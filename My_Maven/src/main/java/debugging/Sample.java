package debugging;

public class Sample {

	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int c=25;
		int d=24;
		int e=c-d;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob=new Sample();
		ob.add();
	}

}
