package fintech.model;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Transaction {
    private Integer id;
    private String accountName;
    private String amount;
    private String timestamp;
    private String note;

    public Transaction(int id, String _accountName, String _amount, String _timestamp, String _note) {
        this.id = id;
        this.accountName = _accountName;
        this.amount = _amount;
        this.timestamp = _timestamp;
        this.note = _note;
    }

    public String output() {
        return id + "|" + accountName + "|" + amount + "|" + timestamp + "|" + note + "|" + amount;
    }
}