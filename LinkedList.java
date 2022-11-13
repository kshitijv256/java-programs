public class LinkedList {
    class Node {
        int data;
        Node next;
        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public void addnode(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addnode(1);
        list.addnode(2);
        list.addnode(3);
        list.addnode(4);
        list.display();
    }
}
