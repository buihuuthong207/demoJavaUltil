package demoLinkedList;

import java.util.LinkedList;

public class demoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao mot linked list
	      LinkedList ll = new LinkedList();
	      // them cac phan tu toi linked list
	      ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Noi dung ban dau cua LinkedList: " + ll);

	      // xoa cac phan tu tu linked list
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Noi dung cua LinkedList sau khi xoa: "
	       + ll);
	      
	      // xoa cac phan tu dau tien va cuoi cung
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("LinkedList sau khi xoa phan tu dau tien va cuoi cung: "
	       + ll);

	      // lay va thiet lap mot gia tri
	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Dathaydoi");
	      System.out.println("LinkedList sau khi thay doi: " + ll);
	}

}
