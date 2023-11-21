package collectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionExample {

	public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<String>();
	l.add("Anu");
	l.add("Sana");
	l.add("Diya");
	l.add("Fida");
	System.out.println("List:"+l);
	
	l.remove(1);
	System.out.println("After deletion List:"+l);
	
	Collections.sort(l);
	System.out.println("List:"+l);
	
	System.out.println("List using for loop");
	for(int i=0;i<l.size();i++)
	{
	
		System.out.println(l.get(i));
	}
	
	
	System.out.println("List using for each loop");
	for(String element:l)
	{
		System.out.println(element);
	}
	
	
	System.out.println("List using iterator");
	Iterator<String>it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
