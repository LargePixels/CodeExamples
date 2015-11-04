package net.largepixels.interview.net.largepixels.pie.ch04.ch04ex01;

public class Runner {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();

        stack.push(new Node("a", null));
        stack.push(new Node("b", null));
        stack.push(new Node("c", null));
        stack.push(new Node("d", null));

        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);

    }

}
