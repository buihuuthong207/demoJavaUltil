package demoCalendar;

import java.util.Calendar;

public class DemoCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
        System.out.println("Ngay gio hien tai: " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 ngay sau: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 thang sau: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 nam sau: " + calendar.getTime());
        
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DAY: " + calendar.get(Calendar.DATE));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("Date And Time: " + calendar.getTime());
        
        //phương thức getMaximun, getMinimum
        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Gia tri MAX cua so ngay trong tuan: " + maximum);
        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Gia tri MAX cua so tuan trong nam: " + maximum);
        
        int minimun = calendar.getMinimum(Calendar.DAY_OF_MONTH);
        System.out.println("Số ngày ít nhất trong một tháng: " + minimun);
	}

}
