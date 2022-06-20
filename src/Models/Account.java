package Models;

public class Account {
    int AccountId;
    String Name;
    float Balance;
    int BankCode;

    public Account(int accountId, String name, float balance,int bankCode) {
        AccountId = accountId;
        Name = name;
        Balance = balance;
        BankCode=bankCode;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public int getBankCode() {
        return BankCode;
    }

    public void setBankCode(int bankCode) {
        BankCode = bankCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountId=" + AccountId +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                ", BankCode="+ BankCode+
                '}';
    }
}
