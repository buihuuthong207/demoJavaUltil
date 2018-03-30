package demoResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;


public class DemoResourceBundle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle bundle = ResourceBundle.getBundle("DemoResourceBundle/MessageBundle_en_US");  
		  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
		  
		   
	}

}
