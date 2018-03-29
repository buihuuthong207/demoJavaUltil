package demoHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import demoMap.Football;

public class DemoTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Football> map = new TreeMap<String, Football>();
		Football f1 = new Football("Mourinho","Smalling","Pogba");
	    Football f2 = new Football("Guadiola","Mangala","Gundogan");
	    Football f3 = new Football("Klopp","Can","Coutinho");
	    Football f4 = new Football("Conte","Azpilicueta","Hazard");
	    map.put("100", f1);
        map.put("101", f2);
        map.put("a3", f4);
        map.put("a2", f3);
        
        Set<String> keySet = map.keySet();
        for(String key : keySet)
        {
        	System.out.println(key + "  " + map.get(key));
        }
	}

}
