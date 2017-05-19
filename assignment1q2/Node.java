/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1q2;

/**
 *
 * @author bea
 */
public class Node {

    private Node next;
    private Object data;

    public Node(Object d) {
        this.next = null;
        this.data = d;
    }

    public Node next() {
        return next;
    }

    public Object getData() {
        return this.data;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public void setData(Object d) {
        this.data = d;
    }
}
