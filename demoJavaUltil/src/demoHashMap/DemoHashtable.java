package demoHashMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class DemoHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("Zara", new Double(3434.34));
	      balance.put("Mahnaz", new Double(123.22));
	      balance.put("Ayan", new Double(1378.00));
	      balance.put("Daisy", new Double(99.22));
	      balance.put("Qadir", new Double(-19.08));

	      // Hien thi tat ca balance trong hash table.
//	      names = balance.keys();
//	      while(names.hasMoreElements()) {
//	         str = (String) names.nextElement();
//	         System.out.println(str + ": " +
//	         balance.get(str));
//	      }
	      Set set = balance.keySet();
	    		for(Object key: set ) 
	    		{
	    			System.out.println(key + " "+ balance.get(key));
	    		}
	      System.out.println();
	      // Gui 1,000 vao tai khoan cua Zara
	      bal = ((Double)balance.get("Zara")).doubleValue();
	      balance.put("Zara", new Double(bal+1000));
	      System.out.println("Balance moi cua Zara la: " +
	      balance.get("Zara"));
	}

}
