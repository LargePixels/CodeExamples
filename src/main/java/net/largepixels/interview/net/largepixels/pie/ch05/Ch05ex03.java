package net.largepixels.interview.net.largepixels.pie.ch05;

import net.largepixels.interviewstructures.nodes.tree.BTreePrinter;
import net.largepixels.interviewstructures.nodes.tree.Node;

/**
 * Created by johnminchuk on 2/15/16.
 */
public class Ch05ex03 {

    private void runMe() {
        Node tree = Node.treeFromArray(new Integer[]{5, 3, 2, 4, 8, 7, 6, 9});

        BTreePrinter.printNode(tree);

        Node zxcv = lowestCommonParent(tree, 9, 6);
        System.out.println("Lowest common parent of 9 and 6 is : " + zxcv.data);

        Node qwer = lowestCommonParent(tree, 7, 6);
        System.out.println("Lowest common parent of 7 and 6 is : " + qwer.data);

    }

    Node lowestCommonParent(Node tree, int a, int b) {
        Node current = tree;
        while ( current != null ) {
            if ( (int) current.data > a && (int) current.data > b ) {
                current = current.left;
            }
            else if ( (int) current.data < a && (int) current.data < b) {
                current = current.right;
            }
            else {
                return current;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Ch05ex03 ch05ex03 = new Ch05ex03();
        ch05ex03.runMe();
    }

}
