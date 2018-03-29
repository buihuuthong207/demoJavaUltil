package demoDate;

import java.util.Date;

public class demoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date day = new Date();
		day.setDate(22);
		Date days = new Date();
		System.out.println(" " + day.toString());
		System.out.println(" "+ day.after(days));
		System.out.println(" " + days.compareTo(day));
		System.out.println(" " + days.clone());
	}

}
