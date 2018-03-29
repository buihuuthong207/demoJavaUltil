package demoMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import demoMap.Football;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Football> map = new HashMap<Integer, Football>();
		Football f1 = new Football("Mourinho","Smalling","Pogba");
	    Football f2 = new Football("Guadiola","Mangala","Gundogan");
	    Football f3 = new Football("Klopp","Can","Coutinho");
	    Football f4 = new Football("Conte","Azpilicueta","Hazard");
	    map.put(100, f1);
        map.put(101, f2);
        map.put(102, f3);
//        Set<Integer> set = map.keySet();
//        for (Integer key : set) {
//            System.out.println(key + " " + map.get(key));
//        }
        
        for(Map.Entry<Integer, Football> i : map.entrySet())
        {
        	System.out.println(i.getValue() + " " + i.getKey());
        }
	}

}
