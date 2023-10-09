package bank;

import common.Account;
import common.Money;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AccountImpl extends UnicastRemoteObject implements Account {
    private String name;
    private Money balance;
    public AccountImpl(String name, Money balance) throws RemoteException {
        this.name = name;
        this.balance = balance;
    }
    public void setBalance(Money money) throws RemoteException{
        this.balance = money;
    }

    public Money getBalance() throws RemoteException{
        return balance;
    }

    public  void setName(String name) throws RemoteException{
        this.name = name;
    }

    public String getName() throws RemoteException{
        return name;
    }
    public void deposit(Money money) throws RemoteException {
        balance.setAmount(balance.getAmount() + money.getAmount());
    }

    public void withdraw(Money money) throws RemoteException {
        if ( balance.getAmount() >= money.getAmount()) {
            balance.setAmount(balance.getAmount() - money.getAmount());
        } else {
            throw new RemoteException("Insufficient funds");
        }
    }
}
