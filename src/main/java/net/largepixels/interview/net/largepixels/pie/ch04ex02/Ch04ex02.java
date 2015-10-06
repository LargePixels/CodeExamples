package net.largepixels.interview.net.largepixels.pie.ch04ex02;

public class Ch04ex02 {

    Node head;
    Node tail;

    public static void main(String[] args) {
        Ch04ex02 ch04ex02 = new Ch04ex02();
        ch04ex02.runMe();
    }

    private void runMe() {

        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);

        head = a;
        tail = e;

        remove(c);
        remove(a);
        remove(e);

        insertAfter(b, "b2");
        insertAfter(d, "f");

        System.out.println("stop");
    }

    public void remove(Node node) {
        Node temp = head;
        if ( temp.data.equals(node.data)) {
            head = temp.next;
            temp.next = null;
        }

        while ( temp.next != null ) {
            if ( temp.next.data.equals(node.data) ) {
                if ( temp.next.next == null ) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    private void insertAfter(Node node, String data) {
        Node temp = head;
        Node insert = new Node(data, null);

        while (temp.next != null) {
            if (temp.data.equals(node.data)) {
                insert.next = temp.next;
                temp.next = insert;
            }
            temp = temp.next;
        }

        if (temp.data.equals(node.data)) {      //if we're inserting after the last node
            tail = insert;
            temp.next = insert;
        }

        if (insert.next == null) {
            tail = insert;
        }

    }

}
