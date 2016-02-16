package net.largepixels.interview.net.largepixels.pie.common.nodeA;

/**
 * Created by johnminchuk on 2/15/16.
 */
public class Node<T extends Comparable<?>> {
    public Node<T> left, right;
    public T data;

    public Node(T data) {
        this.data = data;
    }

    public static <T extends Comparable<T>> Node<T> insert(Node<T> head, Node<T> insert) {
        if (head == null) {
            return insert;
        }

        if ( head.data.compareTo(insert.data) > 0 ) {
            head.left = insert(head.left, insert);
        }

        if ( head.data.compareTo(insert.data) <= 0) {
            head.right = insert(head.right, insert);
        }

        return head;
    }

    public static <T extends Comparable<T>> Node<T> treeFromArray(T[] items) {

        Node<T> head = null;
        for (T item : items) {
            head = insert(head, new Node<T>(item));
        }

        return head;
    }

    public static <T extends Comparable<T>> Node<T> findNodeIter(Node<T> root, T val) {
        while (root != null) {
            if ( root.data == val ) {
                return root;
            }
            else if ( val.compareTo(root.data) < 0 ) {
                root = root.left;
            }
            else if ( val.compareTo(root.data) > 0 ) {
                root = root.right;
            }
            else if ( val.compareTo(root.data) == 0 ) {
                return root;
            }
        }
        return null;
    }

}
