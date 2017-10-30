package ru.archi;


/**
 * Created by Черный on 11.10.2017.
 */
public class Bank {
    private int moneyAmount;

    public Bank(int moneyAmount){
        this.moneyAmount = moneyAmount;
    }

    public void getMoney(int amount) {
        if(moneyAmount < amount){
            System.out.println("Not enough money");
        }else {
            moneyAmount -= amount;
        }
    }

    public boolean hasMoney(int amount){
        return moneyAmount > amount;
    }
}
