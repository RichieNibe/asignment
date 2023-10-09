package common;

import java.io.Serializable;

public class Money implements Serializable {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}
