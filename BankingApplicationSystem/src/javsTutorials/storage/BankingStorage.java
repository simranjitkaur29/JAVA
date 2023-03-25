package javsTutorials.storage;

import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingStorage {
   // public static JavaSecurityAccess.ProtectionDomainCache accountHolder;
    public static Map<Integer,AccountHolderInformation> accountHolder=new HashMap<Integer,AccountHolderInformation>();
    public static Map<Integer, AccountDetails> accountDetails=new HashMap<Integer,AccountDetails>();

    public static int custIdCounter=0;
    public  static int accNoCounter=0;
}
