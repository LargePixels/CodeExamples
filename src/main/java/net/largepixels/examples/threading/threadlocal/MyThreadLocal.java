package net.largepixels.examples.threading.threadlocal;

/**
 * Created by johnminchuk on 3/3/16.
 */
public class MyThreadLocal {

    public static final ThreadLocal userThreadLocal = new ThreadLocal();

    public static void set(Context user) {
        userThreadLocal.set(user);
    }

    public static void unset() {
        userThreadLocal.remove();
    }

    public static Context get() {
        return (Context) userThreadLocal.get();
    }

}