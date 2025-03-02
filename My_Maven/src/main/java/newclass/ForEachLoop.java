package newclass; 
import java.util.ArrayList;
import java.util.List;
public class ForEachLoop {
	
	

	public static void main(String args[])
	
	{
//		int[] num= {1,2,3};
//		
//	for(int a:num)
//	{
//		System.out.println(a);
//	}
		
		List<String> l=new ArrayList<String>();
	    
		l.add("apple");
		l.add("orange");
		l.add("banana");
		for(String fruit:l)
		{
			System.out.println(fruit);
			
			 
		}
	}
	
	
}

