package demoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
        
        list.add("C++");
        list.add("Java");
        list.add("PHP");
        
        System.out.println(list);
 
        
        Collections.addAll(list, "Servlet", "JSP");
       
        System.out.println(list);
 
       
        String[] strArr = { "C#", ".Net" };
        
        Collections.addAll(list, strArr);
        
        System.out.println(list);
        
        System.out.println("Sort");
        Collections.sort(list);
        System.out.println("Name list after sort: " + list.toString());
        
        System.out.println("Shffle");
        Collections.shuffle(list);
        System.out.println("Name list after shuffle: " + list.toString());
        
        System.out.println("Max Min");
        System.out.println("Max = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));
        
        System.out.println("Rename");
        Collections.replaceAll(list, "C#", "C#/C++");
        System.out.println("Name list: " + list.toString());
	}

}
