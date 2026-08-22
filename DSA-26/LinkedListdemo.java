class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode; 
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListdemo{
    public static void main(String[] args){
        LinkedList List= new LinkedList();
        List.insert(10);
        List.insert(20);
        List.insert(30);

        List.printList();

        List.reverse();
        List.printList();

    }
}