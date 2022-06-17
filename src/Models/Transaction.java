package Models;

public class Transaction {

    public enum ServiceProvider{
        Fawry,
        VodafoneCash,
        E_pay
    }

    int TransactionId;
    int FromAccount;
    int ToAccount;
    float Amount;
    boolean Status;

    ServiceProvider ServiceProvider;
    public Transaction(int transactionId, int fromAccount, int toAccount,float amount, boolean status,ServiceProvider serviceProvider) {
        TransactionId = transactionId;
        FromAccount = fromAccount;
        ToAccount = toAccount;
        Amount=amount;
        Status = status;
        ServiceProvider =serviceProvider;
    }

    public int getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(int transactionId) {
        TransactionId = transactionId;
    }

    public int getFromAccount() {
        return FromAccount;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public void setFromAccount(int fromAccount) {
        FromAccount = fromAccount;
    }

    public int getToAccount() {
        return ToAccount;
    }

    public void setToAccount(int toAccount) {
        ToAccount = toAccount;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "TransactionId=" + TransactionId +
                ", FromAccount=" + FromAccount +
                ", ToAccount=" + ToAccount +
                ", Amount=" + Amount +
                ", Status=" + Status +
                '}';
    }
}
