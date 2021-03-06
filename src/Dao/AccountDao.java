package Dao;

import Services.Notification;
import Models.Account;
import ServicesImpl.AccountImp;

import java.util.ArrayList;

public class AccountDao {
    ArrayList<Account> accounts=new ArrayList<>();

    public AccountDao(){
        accounts.add(new Account(1,"waleed",400,1));
        accounts.add(new Account(2,"waleed",800,2));
        accounts.add(new Account(3,"waleed",000,3));
    }
    public void AddAccount(Account account){
        accounts.add(account);
    }
    public void DeleteAccount(int id){
        --id;
        accounts.remove(id);
    }
    public boolean Withdraw(int id,float amount){
        --id;
        float balance=accounts.get(id).getBalance();
        int code=accounts.get(id).getBankCode();
        if (balance<amount){
            return false;
        }else {
            float after = balance - amount;
            accounts.get(id).setBalance(after);
            //System.out.println(accounts.get(id).toString());
            AccountImp.NotifyController notifyController=new AccountImp.NotifyController();
            Notification notification=notifyController.Notifer(code);
            notification.SendNotify();
            return true;
        }
    }
    public boolean Deposit(int id,float amount){
        --id;
        float balance=accounts.get(id).getBalance();
        int code=accounts.get(id).getBankCode();
        if (balance<amount){
            return false;
        }else {
            float after = balance + amount;
            accounts.get(id).setBalance(after);
            //System.out.println(accounts.get(id).toString());
            AccountImp.NotifyController notifyController=new AccountImp.NotifyController();
            Notification notification=notifyController.Notifer(code);
            notification.SendNotify();
            return true;
        }
    }
    public int SendEmail(int id, String transactionType, float amount) {
        System.out.println("Email sent. "+transactionType + " "+ amount);
        return 0;
    }

    public int SendSMS(int id, String transactionType, float amount) {
        System.out.println("Sms sent. "+transactionType + " "+ amount);
        return 0;
    }
}
