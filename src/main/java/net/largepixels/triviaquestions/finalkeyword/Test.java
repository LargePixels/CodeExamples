package net.largepixels.triviaquestions.finalkeyword;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnminchuk on 3/2/16.
 */
public class Test {

    public final List foo;

    public Test() {
        foo = new ArrayList();
        foo.add("foo"); // Modification-1
    }

    public void setFoo(List foo) {
        //this.foo = foo;  //compile time error.
    }

    public static void main(String args[]) {
        Test t1 = new Test();
        t1.foo.add("bruh");
        //t1.foo = new ArrayList();       //can't do this it's final!

        Test t2 = new Test();
        t1.foo.add("bruh");
    }

}
