package queue;

public class MyLinkedListQueue  {
    public Node front;
    public Node rear;
    public MyLinkedListQueue(){
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
//            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    public Node dequeue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp;
    }
    public void display(){
        Node temp = this.front;
        while (temp != this.rear) {
            System.out.println(temp.key);
            temp = temp.next;
        }
        System.out.println(this.rear.key);
    }


    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(14);
        queue.enqueue(22);
        queue.enqueue(-6);
        queue.display();
        System.out.println("-----------");
        queue.dequeue();
        queue.display();
        System.out.println("-----------");
        queue.enqueue(9);
        queue.display();
    }
    }

