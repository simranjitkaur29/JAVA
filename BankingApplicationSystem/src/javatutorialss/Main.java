package javatutorialss;

import javaTutorial.util.BankOperationsUtility;
import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;
import javatutorials.beans.Address;
import javsTutorials.storage.BankingStorage;

import java.util.Random;
import java.util.Scanner;

import static javsTutorials.storage.BankingStorage.accountDetails;

public class Main {
    public static void main(String[] args) {
        BankOperationsUtility bankOperationsUtility=new BankOperationsUtility();
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("we have following operations. Choose one option\n"
                    + "1.Open New Account\n"
                    + "2.Deposit the amount in account\n"
                    + "3.Withdrawl the amount from account\n"
                    + "4.Get customer details\n"
                    + "5.Get Account details\n"
                    + "6.Fund Transfer from one account to other ");

            int option = sc.nextInt();
            // System.out.println(option);

            switch (option) {

                case 1:
                    System.out.println("Thanks for choosing us for your banking operations");
                    System.out.println("Please provide your first name");
                    String firstname = sc.next();
                    System.out.println("Please provide your last name");
                    String lastName = sc.next();
                    System.out.println("Please enter your houseNo");
                    int houseNo = sc.nextInt();
                    System.out.println("Please enter your city");
                    String city = sc.next();
                    System.out.println("Please enter your country");
                    String country = sc.next();
                    //Validation for all information like country and city
                    System.out.println("Please wait for a while we are working on your request...");

                    Address address = new Address(houseNo, city, country);
                    BankingStorage.custIdCounter++;
                    BankingStorage.accNoCounter++;
                    AccountHolderInformation accountHolderInformation = new AccountHolderInformation(option, houseNo, firstname, lastName, address);

                    if (bankOperationsUtility.openAccount(accountHolderInformation)) {
                        System.out.println("Your account open successfully\n"+" Your AccountNo. is : "+accountHolderInformation.getAccountNo()
                        +"Your custom Id is: "+accountHolderInformation.getCustId());
                    } else {
                        System.out.println("Something wrong happened");
                    }

                    break;

                case 2:
                    System.out.println("Please enter your customer Id");
                    int custId = sc.nextInt();
                    if (BankingStorage.accountHolder.keySet().contains(custId)) {
                        System.out.println("Please enter amount you want to deposit");
                        double amount = sc.nextDouble();
                        AccountDetails accountDetails = bankOperationsUtility.depositAmount(custId, amount);
                        System.out.println("Amount is deposited successfully \n" + "Your updated amount is " + accountDetails.getAmount());

                    } else {
                        System.out.println("Customer not found.Please verify your details");
                    }

                    break;

                case 3:
                    System.out.println("Please enter your customer Id");
                    custId = sc.nextInt();
                    if (BankingStorage.accountHolder.keySet().contains(custId)) {
                        System.out.println("Please enter amount you want to withDraw");
                        double amount = sc.nextDouble();
                        AccountDetails accountDetails = bankOperationsUtility.withdrawlAmount(custId, amount);
                        System.out.println("Amount is withDraw successfully \n" + "Your updated amount is " + accountDetails.getAmount());

                    } else {
                        System.out.println("Customer not found.Please verify your details");
                    }
                    break;
                case 4:
                    System.out.println("Please enter your customer Id");
                    custId = sc.nextInt();
                    if (BankingStorage.accountHolder.keySet().contains(custId)) {
                        System.out.println(bankOperationsUtility.getCustomrerDetails(custId).toString());
                    } else {
                        System.out.println("Customer not found.Please verify your details");
                    }
                    break;

                case 5:
                    System.out.println("Please enter your customer Id");
                    custId = sc.nextInt();
                    accountHolderInformation = bankOperationsUtility.getCustomrerDetails(custId);
                    if (accountHolderInformation!=null)
                    {
                        System.out.println(bankOperationsUtility.getAccountDetails(accountHolderInformation.getAccountNo()).toString());

                    }
                        else {
                        System.out.println("Customer not found.Please verify your details");
                    }

                    break;

                case 6:
                    System.out.println("Please enter your customer Id");
                    custId = sc.nextInt();
                    if(bankOperationsUtility.getCustomrerDetails(custId)!=null) {
                        System.out.println("Please enter target customer Id");
                        int custId2 = sc.nextInt();
                        if(custId==custId2) {
                            System.out.println("Source account and target account can't be same");
                            continue;
                        }
                        if(bankOperationsUtility.getCustomrerDetails(custId2)!=null) {
                            System.out.println("Please enter amount you want to transfer");
                           double amount= sc.nextDouble();
                            AccountDetails accountDetails=bankOperationsUtility.withdrawlAmount(custId,amount);
                            bankOperationsUtility.depositAmount(custId2,amount);
                            System.out.println("Your fund transfer is done successfully\n"
                                    + "your updated balance is "+accountDetails.getAmount());
                        }
                        else {
                            System.out.println("Target Customer not found.Please verify details.");
                        }
                    }
                    else {
                        System.out.println("Source Customer not found.Please verify your details.");
                    }
                    break;

                case 7:
                    System.out.println("Thanks for using my application");
                    System.exit(0);


                default:
                    System.out.println("Invalid operation.Please correct option");
                    break;
            }
        }while (true);
    }
}