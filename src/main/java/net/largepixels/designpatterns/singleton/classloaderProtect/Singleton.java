package net.largepixels.designpatterns.singleton.classloaderProtect;

/**
 * Created by johnminchuk on 3/1/16.
 *
 * Ensure you only get a singleton from the thread this classloader this thread is running on
 *
 */
public class Singleton {

    public static Singleton INSTANCE = new Singleton();

    private static Class getClass(String classname) throws ClassNotFoundException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if(classLoader == null) {
            classLoader = Singleton.class.getClassLoader();
        }

        return (classLoader.loadClass(classname));
    }

    public static void main(String args[]) throws ClassNotFoundException {
        Class dog = Singleton.INSTANCE.getClass("net.largepixels.designpatterns.singleton.classloaderProtect.Dog");
        System.out.println(dog.getDeclaredFields());
    }

}