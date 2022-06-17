package Dao;

public class TransactionDao {
    AccountDao account =new AccountDao();

    public boolean Transfer(int From, int To, float Amount) {
       return account.Withdraw(From,Amount)&& account.Deposit(To,Amount);
    }
}
