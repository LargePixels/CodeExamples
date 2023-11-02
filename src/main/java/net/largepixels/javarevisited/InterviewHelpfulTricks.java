package net.largepixels.javarevisited;

import net.largepixels.interviewstructures.nodes.graph.Node;

import java.util.*;

public class InterviewHelpfulTricks {

    public static void main(String[] args) {

        //mentally run through the list of data structures that could help you with the problem
        // array, linked list, tree, graph
        // stack, queue, hash
        // recursion


        //modulus operator, return remainder after division
        //12345 / 10 = 1234 with a remainder of 5
        System.out.println(12345 % 10); //prints 5
        //System.out.println("asdf" % 10); // doesn't work with strings
        System.out.println(12345 / 10);  //div by 10 to lop off last number
        System.out.println(8%2);  //div by 2 to check even or odd, 0 is even, 1 is odd

        System.out.println(7/2);    //this will print 3, java rounds down
        System.out.println(7 % 2);  //you could mod 2, and get that remainder if you need it

        String str = "John Sam Dan";
        System.out.println(str.charAt(0)); //prints j
        System.out.println(str.charAt(3)); //prints n

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(charArray); //prints hello
        System.out.println(charArray[0]); //prints H
        System.out.println(charArray.length); //prints actual length which is 5

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]); //prints hello
        }

        StringBuffer sb = new StringBuffer();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.toString();


        //
        //ArrayList containing a LinkedList of Strings
        //
        List<LinkedList<String>> arrayList = new ArrayList<>();

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Apple");
        linkedList1.add("Banana");
        linkedList1.add("Cherry");

        arrayList.add(linkedList1);

        for (LinkedList<String> llist : arrayList) {
            for (String fruit : llist ) {
                System.out.println(fruit);
            }
        }

        //
        //  Stacks..
        //
        Stack<Character> stack = new Stack<Character>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());  // output; c,b,a
        }

        //great min heap video
        //https://www.youtube.com/watch?v=t0Cq6tVNRBA
        //but you can also use a priority queue in java
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(10);
        heap.add(2);
        heap.add(6);

        while (!heap.isEmpty()) {
            Integer top = heap.peek();
            System.out.println(top);        //2,6,10
            heap.remove(top);
        }


        //let's create some arrays...
        int[] arrayA = {1, 2, 3, 4, 5};
        char[] arrayB = {'j', 'o', 'h', 'n' };

        System.out.println(arrayB[0]);

        char[] arrayC = new char[5];
        arrayC[3] = 'z';

        System.out.println(arrayC[2]);  //prints null
        System.out.println(arrayC[3]);  //prints z

        //and don't forget this helpful trick
        String strA = "holler";
        char[] charArrayB = str.toCharArray();
        String strAback = String.valueOf(charArrayB);      //and you can flip it back


        //
        //Easy hashing Java
        //
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 95);
        scores.put("Alice", 80);
        scores.put("Alice", 83);    //overwrites previous
        scores.put("Bob", 75);

        System.out.println("John's score: " + scores.get("John"));
        System.out.println("Alice exists: " + scores.containsKey("Alice")); //she is in there
        System.out.println("Alice's score: " + scores.get("Alice"));
        scores.remove("Bob");

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {    //also note this for loop shortcut, the "iterator" on the left, the list on the right
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score); //prints john and alice once
        }

        //useful hash trick with array
        Boolean[] charSpot = new Boolean[256];  //there are 256 ascii characters
        int asciiNum = (int) 'c';               //convert ascii 'c' into a number
        charSpot[asciiNum] = true;              //place true in the 'c' spot in the array

        int a = (int) 'a';   //97
        int b = (int) 'b';   //98
        if ( a < b ) {
            System.out.println("casting char to int also helps with alphabetization");
        }


        //a hash set does not allow dupes
        Set<Character> hashSet = new HashSet();
        //Map<String, Integer> hashMap = new HashMap<>();  //compare with the declaration of map
        hashSet.add('a');
        hashSet.add('b');
        hashSet.add('a');
        System.out.println(hashSet.size());  //size is 2 because there are no dupes


        //
        //  graphs
        //
        watchMeInitalizeThisGraph();  // just watch it..

    }

    private static void watchMeInitalizeThisGraph() {
        //just wrap your head around this. a node contains an array of nodes, tada.. graph.
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");

        a.nodes = new Node[]{b, c, e};
        b.nodes = new Node[]{a, c};
        c.nodes = new Node[]{a, b, e};
        d.nodes = new Node[]{e};
        e.nodes = new Node[]{a, c, d};
    }
}
