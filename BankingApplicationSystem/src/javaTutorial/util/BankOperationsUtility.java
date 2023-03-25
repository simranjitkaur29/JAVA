package javaTutorial.util;
import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;
import javsTutorials.storage.BankingStorage;

public class BankOperationsUtility {

    public boolean openAccount(AccountHolderInformation accountHolderInformation)
    {
        BankingStorage.accountHolder.put(accountHolderInformation.getCustId(),accountHolderInformation);
        BankingStorage.accountDetails.put(accountHolderInformation.getAccountNo(),
                new AccountDetails(accountHolderInformation.getAccountNo(),0));
        return  true;
    }
    public  AccountDetails getAccountDetails(int accountNo)
    {
        return BankingStorage.accountDetails.get(accountNo);
       }
    public AccountHolderInformation getCustomrerDetails(int accountNo)
    {

        return BankingStorage.accountHolder.get(accountNo);
    }

    public AccountDetails depositAmount(int custId,double amount)
    {
        AccountHolderInformation accountHolderInformation=getCustomrerDetails(custId);
        AccountDetails accountDetails=getAccountDetails(accountHolderInformation.getAccountNo());
        accountDetails.setAmount(accountDetails.getAmount()+amount);
        return accountDetails;
    }
    public AccountDetails withdrawlAmount(int accountNo,double amount)
    {
        AccountHolderInformation accountHolderInformation=getCustomrerDetails(accountNo);
        AccountDetails accountDetails=getAccountDetails(accountHolderInformation.getAccountNo());
        accountDetails.setAmount(amount-accountDetails.getAmount());
        return accountDetails;


    }

}
