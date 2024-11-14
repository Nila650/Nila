package collectionsample;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
//add
	 a.add("nila");
	 a.add(85);
	 a.add('l');
	 a.add(1.23f);
	 System.out.println(a);
	
	 ArrayList<String> a1=new ArrayList<String>();
	 a1.add("ami");
	 a1.add("hii");
	// a1.add(7);
	 System.out.println(a1);
	 
	 ArrayList<String> a2=new ArrayList();
	 a2.add("welcome");
	 a2.add("hello");
	 //addAll
	 a2.addAll(a1);
	 System.out.println(a2);
	 //remove
	 a2.remove(2);
	 System.out.println(a2);
	 a1.removeAll(a1);
	 System.out.println(a1);
	 //size
	 System.out.println(a2.size());
	 //contains
	 System.out.println( a2.contains("hii"));
	 System.out.println( a2.contains("hw"));
	 System.out.println( a2.contains("Hii"));
	 System.out.println(a2.isEmpty());
	 System.out.println(a1.isEmpty());
	 
	 
	 LinkedList l=new LinkedList();
	 l.add("frit");
	 l.add("veg");
	 System.out.println(l);
	 
	 LinkedList<String> l1=new LinkedList();
	 l1.add("animal");
	 l1.add("cat");
	 l1.add("dog");
	 
	 LinkedList<String> l2=new LinkedList();
	 l2.add("bird");
	 l.add("lion");
	 l2.addAll(l1);
	 System.out.println(l2);
	 l2.remove(2);
	 System.out.println(l2);
	 l1.removeAll(l1);
	 System.out.println(l1);
	 System.out.println(l2.size());
	 System.out.println(l2.contains("bird"));
	 System.out.println(l2.isEmpty());
	 
	}
	
	}


