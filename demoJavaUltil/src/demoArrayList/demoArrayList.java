package demoArrayList;

import java.util.ArrayList;

public class demoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Football> football = new ArrayList<Football>();
	    Football f1 = new Football("Mourinho","Smalling","Pogba");
	    Football f2 = new Football("Guadiola","Mangala","Gundogan");
	    Football f3 = new Football("Klopp","Can","Coutinho");
	    Football f4 = new Football("Conte","Azpilicueta","Hazard");
	    
	    football.add(f1);
	    football.add(f2);
	    football.add(f3);
	    football.add(f4);
	   
	    showList(football);
	    
	    System.out.println(" index cua Man city: "  + football.indexOf(f2));
		
		
	    
	}
	
	public static void showList(ArrayList<Football> list) {
        // Show list through for-each
        for (Football obj : list) {
            System.out.println("\t" + obj + ", ");
        }
        System.out.println();
	    
	}
}
