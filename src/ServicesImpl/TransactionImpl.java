package ServicesImpl;

import Dao.AccountDao;
import Dao.TransactionDao;
import Models.Transaction;
import Services.TransactionServices;

public class TransactionImpl implements TransactionServices {
    TransactionDao transactionDao=new TransactionDao();
    @Override
    public boolean Transfer(int From, int To, float Amount) {
       return transactionDao.Transfer(From,To,Amount);
    }
}
