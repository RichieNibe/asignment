package bank;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteAccount {
    public static void main(String[] args) {
        try {
            AccountImpl account = new AccountImpl("John Raymond", new common.Money(0));
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("JohnRaymondAccount", account);
            System.out.println("RemoteAccount ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
