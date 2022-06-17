package Dao;

import Models.Account;

import java.util.ArrayList;

public class AccountDao {
    ArrayList<Account> accounts=new ArrayList<>();

    public AccountDao(){
        accounts.add(new Account(1,"waleed",400));
        accounts.add(new Account(2,"waleed",800));
        accounts.add(new Account(3,"waleed",000));
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
        if (balance<amount){
            return false;
        }else {
            float after = balance - amount;
            accounts.get(id).setBalance(after);
            System.out.println(accounts.get(id).toString());
            return true;
        }
    }
    public boolean Deposit(int id,float amount){
        --id;
        float balance=accounts.get(id).getBalance();
        if (balance<amount){
            return false;
        }else {
            float after = balance + amount;
            accounts.get(id).setBalance(after);
            System.out.println(accounts.get(id).toString());
            return true;
        }
    }
}
