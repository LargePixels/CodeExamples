package net.largepixels.designpatterns.singleton.registrySingleton;

import java.util.HashMap;

/**
 * Created by johnminchuk on 3/1/16.
 *
 * http://www.javaworld.com/article/2073352/core-java/simply-singleton.html?page=2
 */
public class Singleton {

    private static HashMap map = new HashMap();

    protected Singleton() {
        // Exists only to thwart instantiation
    }

    public static synchronized Singleton getInstance(String classname) {
        if (classname == null)
            throw new IllegalArgumentException("Illegal classname");

        Singleton singleton = (Singleton) map.get(classname);
        if (singleton != null) {
            System.out.println("got singleton from map: " + singleton);
            return singleton;
        }

        if (classname.equals("SingeltonSubclass_One"))
            singleton = new SingletonSubclass_One();
        else if (classname.equals("SingeltonSubclass_Two"))
            singleton = new SingletonSubclass_Two();

        map.put(classname, singleton);

        System.out.println("created singleton: " + singleton);

        return singleton;

    }
}
