package net.largepixels.interview.net.largepixels.pie.ch05;

import net.largepixels.interview.net.largepixels.pie.common.nodeA.BTreePrinter;
import net.largepixels.interview.net.largepixels.pie.common.nodeA.Node;

import java.util.Stack;

/**
 * Created by johnminchuk on 2/15/16.
 */
public class Ch05ex02 {

    private void runMe() {

        Node tree = Node.treeFromArray(new Integer[]{5, 3, 2, 4, 8, 7, 6, 9});

        BTreePrinter.printNode(tree);

        preorderTraversal(tree);
    }

    void preorderTraversal( Node root ){
        Stack<Node> stack = new Stack<>();

        stack.push( root );
        while( true ){
            Node curr = null;

            try { curr = stack.pop(); } catch(Exception e){ }

            if( curr == null )
                break;

            System.out.println(curr.data);

            Node n = curr.right;
            if( n != null )
                stack.push( n );

            n = curr.left;
            if( n != null )
                stack.push( n );
        }
    }

    public static void main(String args[]) {
        Ch05ex02 ch05ex02 = new Ch05ex02();
        ch05ex02.runMe();
    }
}
