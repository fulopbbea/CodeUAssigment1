package assignment1q2;

/**
 *
 * @author bea
 */
public class LinkedList {
    
    private Node head;
    
    public LinkedList() {
        this.head = new Node(null);
    }
    
    public void append(Node n) {
        Node last = this.head;
        for (Node it = this.head; it != null; it = it.next()) {
            last = it;
        }
        last.setNext(n);
    }
    
    public Node getKthLastElement(int k) {
        Node kth = null, it;
        int i = 0;
        for (it = this.head; it != null; it = it.next(), i++) {
            if (i - 1 == k) {
                kth = this.head;
                break;
            }
        }
        for (; it != null; it = it.next(), kth = kth.next());
        return kth;
    }
    
    public void print() {
        Node it;
        for (it = head.next(); it != null; it = it.next()) {
            System.out.print(it.getData() + " ");
        }
        System.out.println();
    }
}
