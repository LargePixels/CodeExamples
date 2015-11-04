package net.largepixels.interview.net.largepixels.pie.ch05ex01;

/**
 * Created by minchuk on 11/4/2015.
 */
public class Ch05ex01 {

    private class Node {
        Node left;
        Node right;

        int value;

        Node(int value) {
            this.value = value;
        }
    }

    private void runMe() {

        Node head = null;

        head = insert(head, new Node(100));
        head = insert(head, new Node(50));
        head = insert(head, new Node(150));
        head = insert(head, new Node(25));
        head = insert(head, new Node(75));
        head = insert(head, new Node(125));
        head = insert(head, new Node(175));
        head = insert(head, new Node(110));

        System.out.println("stop");
    }

    public Node insert(Node head, Node insert) {
        if ( head == null ) {
            return insert;
        }

        if ( head.value > insert.value ) {
            head.left = insert(head.left, insert);
        }
        else if ( head.value < insert.value ) {
            head.right = insert(head.right, insert);
        }

        return head;
    }

    public static void main(String[] args){
        Ch05ex01 ch05ex01 = new Ch05ex01();
        ch05ex01.runMe();
    }

}
