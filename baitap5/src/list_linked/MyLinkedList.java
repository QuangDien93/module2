package list_linked;

import java.util.List;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node holder = new Node(data);
        temp.next = holder;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public boolean remove(Object e) {
        boolean deleted = false;
        while (head.data == e) {
            head = head.next;
            deleted = true;
        }
        Node temp = head;
        Node tempLast = head.next;
        while (tempLast != null) {
            if (tempLast.data == e) {
                temp.next = tempLast.next;
                tempLast = temp.next;
                deleted = true;
            } else {
                temp = temp.next;
                tempLast = temp.next;
            }
        }
        return deleted;
    }
    public int size() {
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            int count = 1;
            for (int i = 0; temp.next != null; i++) {
                temp = temp.next;
                count++;
            }
            return count;
        }
    }
    public MyLinkedList clone(){

        MyLinkedList listNew = new MyLinkedList(head);
        return listNew;
    }
    public boolean contains(Object o){
        Node temp = head;
        boolean contains = false;
        for (int i = 0; temp.next != null ; i++) {
            if(temp.data == o){
                contains = true;
                break;
            }
        }
        return contains;
    }
    public int indexOf(Object o) {
        if (head.data == o) {
            return 0;
        } else {
            Node temp = head;
            for (int i = 0; temp.next != null; i++) {
                if (temp.data == o) {
                    return i;
                } else {
                    temp = temp.next;
                }
            }
            return -1;
        }
    }
}
