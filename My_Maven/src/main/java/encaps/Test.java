package encaps;

public class Test {

	private String name;
	private int age;
	public void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void getData()
	{
		
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	
	
}
