package collectionsample;

import java.util.HashSet;
import java.util.Set;

public interface InterfaceSetCollection {

	
	public static void main(String args[])
	{
		Set s=new HashSet();
		s.add("nil");
		s.add("lila");
		System.out.println(s);
		Set<String> s1=new HashSet();
		s1.add("rabit");
		s1.add("eli");
		System.out.println(s1);
		
	s1.addAll(s);
	System.out.println(s1);
	s1.remove(2);
	System.out.println(s1);
	s.removeAll(s);
	System.out.println(s);
	System.out.println(s1.contains("eli"));
	System.out.println(s1.isEmpty());
	System.out.println(s1.size());
		
		
		
	}
	
	
	
}
