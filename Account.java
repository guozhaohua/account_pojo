import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

public class Account {

    // account UUID
    private UUID accountUUID;

    // account lock
    private boolean locked = false;

    // the balance of current account
    private BigInteger balance = BigInteger.ZERO;

    // DB connection
    private Object connection;

    // the simple info like
    // user_name,sex,age,email,phone_number..
    // keep this message with JSON in DB, we can just get it by one colum.
    private String simpleInfo;

    public Account(Object connection, String accountUUID) {

        try {
            // get the target account info thur DB connection
        }catch(Exception e) {
            e.printStackTrace();
            //log...
        }
    }

    public UUID getUUID(){
        return this.accountUUID;
    }

    public String getSimpleInfo() {
        return this.simpleInfo;
    }

    public boolean getLocked(){
        return this.locked;
    }

    public void lockAccount(){
        try {
            this.locked = true;
            // try to lock this account
            // in the detailed implementation we will use retry
        }catch(Exception e) {
            e.printStackTrace();
            //log...
        }
    }

    public BigInteger getBalance() {
        try {
            // try to use DB connection to obtain the balance
            // set the actual value to balance
            return balance;
        }catch(Exception e) {
            e.printStackTrace();
            //log...
        }
        return balance;
    }

    public List<Object> getHistory() {
        try {
            // try to use DB connection to obtain the history
            // return the last 10/20/30 history
        }catch(Exception e) {
            e.printStackTrace();
            //log...
        }
        return null;
    }

    //.... we can put more common function here, but not all
    //it just a very frequently used
}
