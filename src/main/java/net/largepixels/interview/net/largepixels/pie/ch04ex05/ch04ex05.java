package net.largepixels.interview.net.largepixels.pie.ch04ex05;

public class Ch04ex05 {

    public static void main(String[] args) {
        Ch04ex05 ch04ex05 = new Ch04ex05();
        ch04ex05.runMe();
    }

    private class Node {
        Node next;
        Node child;

        String value;
    }

    private void runMe() {

        Node a = new Node();
        a.value = "a";
        Node b = new Node();
        b.value = "b";
        Node c = new Node();
        c.value = "c";
        Node d = new Node();
        d.value = "d";
        Node e = new Node();
        e.value = "e";
        Node f = new Node();
        f.value = "f";
        Node g = new Node();
        g.value = "g";
        Node h = new Node();
        h.value = "h";

        a.next = b;
        b.next = c;
        c.next = d;

        b.child = e;
        e.next = f;
        f.next = g;

        d.child = h;

        //a b  c  d
        //  efg   h

        flattenList(a);

        System.out.println("linked list starting at A is now flat");
    }

    public Node flattenList(Node head) {
        if ( head == null ) {
            return head;
        }

        Node c = flattenList(head.child);

        Node temp = head.next;
        if ( c != null) {
            head.next = c;
            head = fastFoward(head);
            head.next = temp;
        }

        flattenList(head.next);

        return head;
    }

    private Node fastFoward(Node head) {
        while ( head.next != null ) {
            head = head.next;
        }
        return head;
    }

}
