import Models.Account;
import Models.Transaction;
import ServicesImpl.AccountImp;
import ServicesImpl.TransactionImpl;

public class startUp {
    public static void main(String[] args) {
        System.out.println("Welcome..");

        Transaction transaction=new Transaction(0,1,2,500,false, Transaction.ServiceProvider.E_pay);
        TransactionImpl transaction1=new TransactionImpl();
        int from=transaction.getFromAccount();
        int to=transaction.getToAccount();
        if(transaction1.Transfer(from,to,transaction.getAmount())){
            transaction.setStatus(true);
        }
        System.out.println(transaction.toString());
    }
}
