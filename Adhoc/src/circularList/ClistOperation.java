package circularList;

public class ClistOperation {

	 public static void main(String[] args) {
	        Clist list1 = new Clist(1);
	        Clist hn1 = new Clist(2);
	        Clist hn2 = new Clist(3);
	        Clist hn3 = new Clist(4);
	        Clist hn4 = new Clist(5);
	        Clist hn5 = new Clist(6);
	        hn4.setNext(hn5);
	        Clist hn6 = new Clist(7);
	        Clist hn7 = new Clist(8);
	        Clist hn8 = new Clist(9);
	        Clist hn9 = new Clist(10);
	        Clist hn10 = new Clist(11);
	        list1.setNext(hn1);
	        hn1.setNext(hn2);
	        hn2.setNext(hn3);
	        hn3.setNext(hn4);
	        hn4.setNext(hn5);
	        hn5.setNext(hn6);
	        hn6.setNext(hn7);
	        hn7.setNext(hn8);
	        hn8.setNext(hn9);
	        hn9.setNext(hn10);
	        list1.listlen(list1);
	        hn10.setNext(list1);
	        list1.findMiddleNLastElement(list1);
	    }
}
