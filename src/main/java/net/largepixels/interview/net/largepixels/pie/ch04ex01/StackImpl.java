package net.largepixels.interview.net.largepixels.pie.ch04ex01;

public class StackImpl implements StackInterface {

    Node top;

    @Override
    public void push(Node node) {
        if ( top == null ) {
            top = node;
        }
        else {
            node.next = top;
            top = node;
        }
    }

    @Override
    public Node pop() {
        Node popped = top;
        top = popped.next;

        return popped;
    }
}
