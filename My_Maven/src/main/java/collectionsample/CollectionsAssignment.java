package collectionsample;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsAssignment {

	
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("black");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
	
		System.out.println(a.get(1));
		System.out.println(a.contains("red"));
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
