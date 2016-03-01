package net.largepixels.designpatterns.singleton.reflectionSingleton;

import java.util.HashMap;

/**
 * Created by johnminchuk on 3/1/16.
 *
 * http://www.javaworld.com/article/2073352/core-java/simply-singleton.html?page=2
 *
 */
public class Singleton {

    private static HashMap map = new HashMap();

    protected Singleton() {
        // Exists only to thwart instantiation
    }

    public static synchronized Singleton getInstance(String classname) {

        Singleton singleton = (Singleton)map.get(classname);

        if(singleton != null) {
            return singleton;
        }
        try {
            singleton = (Singleton)Class.forName(classname).newInstance();
        }
        catch(ClassNotFoundException cnf) {
            System.out.println("Couldn't find class " + classname);
        }
        catch(InstantiationException ie) {
            System.out.println("Couldn't instantiate an object of type " + classname);
        }
        catch(IllegalAccessException ia) {
            System.out.println("Couldn't access class " + classname);
        }

        map.put(classname, singleton);

        System.out.println("created singleton: " + singleton);

        return singleton;
    }

}
