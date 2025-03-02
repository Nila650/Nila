package review;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList();
		a.add("pen");
		a.add("pencil");
		a.add("book");
		a.add("paper");

		System.out.println(a);
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		
	}

}
