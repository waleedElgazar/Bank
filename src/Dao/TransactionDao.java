package Dao;

import ServicesImpl.AccountImp;

public class TransactionDao {
    AccountImp account =new AccountImp();

    public boolean Transfer(int From, int To, float Amount) {
       return account.Withdraw(From,Amount)&& account.Deposit(To,Amount);
    }
}
