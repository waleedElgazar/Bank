package ServicesImpl;

import Dao.AccountDao;
import Models.Alahly;
import Models.Misr;
import Models.Account;
import Services.AccountServices;
import Services.Notification;

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


    public static class NotifyController {
        public Notification Notifer(int code){
            if (code==1){
                return new Alahly();
            }else{
                return new Misr();
            }
        }
    }
}
