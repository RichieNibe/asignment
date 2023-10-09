package client;

import common.Account;
import common.Money;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("in-csci-rrpc01.cs.iupui.edu", 1099);
            Account account = (Account) registry.lookup("JohnRaymondAccount");

            account.deposit(new Money(1000));
            System.out.println("Deposited $1000. Current balance: $" + account.getBalance().getAmount());

            account.withdraw(new Money(200));
            System.out.println("Withdrew $200. Current balance: $" + account.getBalance().getAmount());

            account.withdraw(new Money(900));
            System.out.println("Withdrew $900. Current balance: $" + account.getBalance().getAmount());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
