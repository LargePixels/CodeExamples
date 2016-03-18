package net.largepixels.examples.threading.threadlocal;

/**
 * Created by johnminchuk on 3/3/16.
 */
public class BusinessService {

    public void businessMethod() {
        // get the context from thread local
        Context context = MyThreadLocal.get();
        System.out.println(context.getTransactionId());
    }

}
