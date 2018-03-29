package demoHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class demoLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> HashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// add elements to linkedHashMap
		linkedHashMap.put(1, "Java");
		linkedHashMap.put(3, "C++");
		linkedHashMap.put(2, "PHP");
		linkedHashMap.put(4, "Python");
		
		HashMap.put(1, "Java");
		HashMap.put(3, "C++");
		HashMap.put(2, "PHP");
		HashMap.put(4, "Python");
		
		Set<Integer> keySet = HashMap.keySet();
		for(Integer key : keySet)
		{
			System.out.println(key + " " + HashMap.get(key));
		}
		
     	System.out.println("---------------------------------");
     	
		show(linkedHashMap);
		
	}
	public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
	}
}
