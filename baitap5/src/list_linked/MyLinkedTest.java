package list_linked;

import javax.management.StandardEmitterMBean;

public class MyLinkedTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(9);
        ll.add(4,11);
        ll.addFirst(8);
        ll.addLast(12);
        ll.addFirst(10);
        ll.addFirst(10);
        System.out.println("so phan tu truoc remove: "+ ll.size());
        Object a = (int)10;
        ll.remove(a);
        ll.printList();
        System.out.println("so phan tu sau remove: "+ ll.size());
        MyLinkedList kk = ll.clone();
        kk.printList();
    }
}
