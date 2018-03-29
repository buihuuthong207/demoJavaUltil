package demoVector;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Size ban dau " + v.size());
		System.out.println("Capacity ban dau: " + v.capacity());
		
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(5));
		System.out.println("Vector" + v.toString());
		System.out.println("Size: " + v.size());
		System.out.println("First element: " + v.firstElement());
		System.out.println("Last element: " + v.lastElement());
		
		if(v.contains("3")){
			System.out.println("Vector contains '3'.");
		}else{
			System.out.println("Vector doesn't contain '3'.");
		}
		
		Enumeration<Integer> e = v.elements();
		System.out.println("Elements in vector: ");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement() + " ");
}
	}

}
