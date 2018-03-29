//package demoList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//
//public class ListExample {
//    public static void main(String args[]) {
//        List<String> list = new LinkedList<String>();
//        list.add("Java");
//        list.add("C++");
//        list.add("PHP");
//        list.add("Python");
////        System.out.println("Phan tu co index = 2 la: " + list.get(3));
//        //duyệt list bằng ListIterator
//        ListIterator i = list.listIterator();
//        while (i.hasNext()) {
//            System.out.println(i.nextIndex() + " -> " + i.next());
//        }
//        System.out.println();
//        
//        while (i.hasPrevious()) {
//            System.out.println(i.previousIndex()+ " -> " + i.previous());
//        }
//        System.out.println();
//        
//        //Duyệt List bằng For
//        for(int j = 0; j < list.size(); j ++)
//        {
//        	System.out.println(list.get(j));
//        }
//        System.out.println();
//        //duyệt List bằng Foreach
//        for(String z : list)
//        {
//        	System.out.println(z +  " ");
//        }
//    }
//}