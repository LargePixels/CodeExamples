package net.largepixels.interview.net.largepixels.pie.ch04ex07;

import net.largepixels.interview.net.largepixels.pie.ch04ex01.Node;

/**
 * Created by johnminchuk on 10/29/15.
 */
public class Ch04ex07 {

    public static void main(String[] args) {
        Ch04ex07 ch04ex07 = new Ch04ex07();
        ch04ex07.runMe();
    }

    private void runMe() {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);

        boolean isCircular = isCircular(a);

        System.out.println(isCircular);

        e.next = d; //loop it

        isCircular = isCircular(a);

        System.out.println(isCircular);
    }

    private boolean isCircular(Node head) {
        Node current = head;
        Node faster = head;

        if ( current.next != null ){
            faster = current.next.next;
        }
        else {
            return false;
        }

        while (current.next != null) {
            if (current == faster) {
                return true;
            }

            if (faster.next != null) {
                faster = faster.next.next;
            }
            else {
                return false;
            }

            current = current.next;
        }

        return false;
    }

}
