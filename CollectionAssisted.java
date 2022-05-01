package project2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionAssisted {
public static void main(String[] args)
{
	System.out.println("ArrayList Mixed Data");
	ArrayList al= new ArrayList();
	al.add(10);
	al.add("sachin");
	al.add('s');
	al.add(1909.87f);
	al.add(123456.789);
	System.out.println(al);
	System.out.println("ArrayList for Specific data");
	ArrayList<String> city= new ArrayList<String>();
	city.add("Banglooru");
	city.add("Delhi");
			System.out.println(city);
			System.out.println("vector list");
			Vector vec= new Vector();
			vec.addElement(100);
			vec.addElement(50);
			System.out.println(vec);
			
			LinkedList<String> names= new LinkedList<String>();
			names.add("Hardik");
			names.add("king");
			Iterator<String> itr= names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			HashSet<Integer> set= new HashSet<Integer>();
			set.add(15);
			set.add(20);
			
				System.out.println(set);
				LinkedHashSet<Integer> set2= new LinkedHashSet<Integer>();
				set2.add(15);
				set2.add(20);
				
					System.out.println(set2);
	
}
}
