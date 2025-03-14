package fintech.model;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Account {
    private String owner;
    private String accountname;
    private double balance;

    public Account(String _owner, String _accountname) {
        this.owner = _owner;
        this.accountname = _accountname;
        this.balance = 0.0;
    }
    
    @Override
    public String toString() {
         return accountname + "|" + owner + "|" + balance;
    }

}