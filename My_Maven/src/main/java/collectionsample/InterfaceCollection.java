package collectionsample;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceCollection {

	
	public static void main(String args[])
	{
		List l=new ArrayList();
		l.add("nil");
		l.add(12);
		System.out.println(l);
		
		List<String> l1=new ArrayList();
		l1.add("hi");
		l1.add("welcome");
		System.out.println(l1);
		l.addAll(l1);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l1.removeAll(l1);
		System.out.println(l1);
		System.out.println(l.size());
		System.out.println(l.contains("hi"));
		System.out.println(l.isEmpty());
		
		
	//	Set s=new ArrayList();
		
		
	}
}
