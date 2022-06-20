package ServicesImpl;

import Dao.AccountDao;
import Models.Account;
import Services.AccountServices;

import java.util.ArrayList;

public class AccountImp implements AccountServices {
    AccountDao accountDao=new AccountDao();
    @Override
    public void InsertAccount(Account account) {
        accountDao.AddAccount(account);
    }

    @Override
    public void DeleteAccount(int id) {
        accountDao.DeleteAccount(id);
    }

    @Override
    public boolean Deposit(int AccountId, float amount) {
        return accountDao.Deposit(AccountId,amount);
    }

    @Override
    public boolean Withdraw(int AccountId, float amount) {
        return accountDao.Withdraw(AccountId,amount);
    }




}
