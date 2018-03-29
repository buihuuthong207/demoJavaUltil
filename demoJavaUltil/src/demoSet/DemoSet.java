package demoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import demoMap.Football;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		TreeSet<String> set2 = new TreeSet<String>();
		
	    set.add("1");
	    set.add("4");
	    set.add("3");
	    set.add("3");
	    set.add("2");
	    set.add("a");
	    set.add("5");
	    set.add("a1");
	    set.add("b3");
	    set.add("F3");
	    
	    set1.add("1");
	    set1.add("4");
	    set1.add("3");
	    set1.add("3");
	    set1.add("2");
	    set1.add("a");
	    set1.add("5");
	    set1.add("a1");
	    set1.add("b3");
	    set1.add("F3");
	    
	    set2.add("1");
	    set2.add("4");
	    set2.add("3");
	    set2.add("3");
	    set2.add("2");
	    set2.add("a");
	    set2.add("5");
	    set2.add("a1");
	    set2.add("b3");
	    set2.add("F3");
	    
	    System.out.println("-----HashMap---------");
	    Iterator<String> iterator = set.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next() + " ");
	    }
	    
	    System.out.println("-----LinkedHashMap---------");
	    Iterator<String> iterator1 = set1.iterator();
	    while(iterator1.hasNext())
	    {
	    	System.out.println(iterator1.next() + " ");
	    }
	    
	    System.out.println("-----TreeMap---------");
	    Iterator<String> iterator2 = set2.iterator();
	    while(iterator2.hasNext())
	    {
	    	System.out.println(iterator2.next() + " ");
	    }
	    
	}

}
