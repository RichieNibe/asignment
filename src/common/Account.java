package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Account extends Remote {
    String getName() throws RemoteException;

    void setName(String name) throws RemoteException;

    Money getBalance() throws RemoteException;

    void setBalance(Money money) throws RemoteException;

    void deposit(Money money) throws RemoteException;

    void withdraw(Money money) throws RemoteException;
}

