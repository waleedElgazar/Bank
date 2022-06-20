package Services;

import Models.Account;

public interface AccountServices {
    public void InsertAccount(Account account);
    public void DeleteAccount(int id);
    public boolean Deposit(int AccountId,float amount);
    public boolean Withdraw(int AccountId,float amount);

}
