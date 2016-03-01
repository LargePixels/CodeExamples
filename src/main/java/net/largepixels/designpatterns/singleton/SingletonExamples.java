package net.largepixels.designpatterns.singleton;

/**
 * Created by johnminchuk on 3/1/16.
 */
public class SingletonExamples {

    private void runMe() {
        SimpleSingleton instance = SimpleSingleton.getInstance();
    }

    public static void main(String args[]) {
        SingletonExamples singletonExamples = new SingletonExamples();
        singletonExamples.runMe();
    }

}
