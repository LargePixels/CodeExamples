package net.largepixels.interview.net.largepixels.pie.ch04ex04;

import net.largepixels.interview.net.largepixels.pie.ch04ex02.Node;

public class Ch04ex04 {

    public static void main(String[] args) {
        Ch04ex04 ch04ex04 = new Ch04ex04();
        ch04ex04.runMe();
    }

    private void runMe() {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);

        Node n = nthToLast(a, 2);
        System.out.println(n.data);

        n = nthToLast2(a, 2);
        System.out.println(n.data);
    }

    public Node nthToLast2(Node head, int position) {
        Node current = head;
        Node trailing = head;

        for (int i = 0; i < position; i++) {
            if ( current.next != null )
                current = current.next;
            else
                return null;
        }

        while ( current.next != null ) {
            trailing = trailing.next;
            current = current.next;
        }

        return trailing;
    }

    public Node nthToLast(Node head, int position) {       //limited by int.MAX_SIZE
        Node current = head;
        Node trailing = head;

        int startCounting = 0;

        while (current.next != null) {
            if ( startCounting < position ) {
                startCounting++;
            } else {
                trailing = trailing.next;
            }

            current = current.next;
        }

        return trailing;
    }
}
