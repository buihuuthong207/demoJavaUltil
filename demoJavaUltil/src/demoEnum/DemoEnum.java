package demoEnum;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;

public class DemoEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration tong;
		Vector<String> name = new Vector<String>();
		name.add("Thông");
		name.add("Tien");
		name.add("thi");
		name.add("nhan");
		
		tong = name.elements();
		while(tong.hasMoreElements())
		{
			System.out.println(" " + tong.nextElement());
		}
	
	}

}
