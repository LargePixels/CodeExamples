package net.largepixels.examples.threading.threadlocal;

/**
 * Created by johnminchuk on 3/3/16.
 */
public class Context {

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    private String transactionId = null;



}
