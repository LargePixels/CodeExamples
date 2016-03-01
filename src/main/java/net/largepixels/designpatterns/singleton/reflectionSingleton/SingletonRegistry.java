package net.largepixels.designpatterns.singleton.reflectionSingleton;

import java.util.HashMap;

/**
 * Created by johnminchuk on 3/1/16.
 */
public class SingletonRegistry {

    public static SingletonRegistry REGISTRY = new SingletonRegistry();
    private static HashMap map = new HashMap();

    protected SingletonRegistry() {
        // Exists to defeat instantiation
    }


    //use like... SingletonRegistry.REGISTRY.getInstance("asdf")
    public static synchronized Object getInstance(String classname) {

        Object singleton = map.get(classname);

        if(singleton != null) {
            return singleton;
        }

        try {
            singleton = Class.forName(classname).newInstance();
            System.out.println("created singleton: " + singleton);
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

        return singleton;
    }

}