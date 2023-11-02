package net.largepixels.dailyCoding;

import net.largepixels.interviewstructures.nodes.tree.BTreePrinter;
import net.largepixels.interviewstructures.nodes.tree.Node;

public class Dc08UniversalTree {

    public static void main(String[] args) {
        Dc08UniversalTree dc08UniversalTree = new Dc08UniversalTree();
        dc08UniversalTree.runMe();
    }

    private void runMe() {

        /*  Java 8 has some kind of issue here...
        Node<Integer> head = new Node(0, new Node(1, null, null), new Node(0, new Node(1, new Node(1), new Node(1)), new Node(0)));
        BTreePrinter.printNode(head);

        System.out.println(countUniversalSubtrees(head));
        */

    }

    private int countUniversalSubtrees(Node<Integer> head) {

        //if head has similar values or null count++
        //if I have left pass it on for a total and save as lefttotal
        //if i have right pass it on for a total and save as right total
        //return total + lefttotal + righttotal

        if (head == null) {
            return 0;
        }

        int total = 0;

        if (head.left != null && head.right != null) {
            if (head.left.data == head.right.data) {
                total++;
            }
        }

        if (head.left == null && head.left == null) {
            total++;
        }

        return total + countUniversalSubtrees(head.left) + countUniversalSubtrees(head.right);


    }


}
