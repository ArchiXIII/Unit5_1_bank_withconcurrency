package ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class Controller {
    public static void main(String[] args) {
        final Bank bank = new Bank(1000000);

        for(int i=0; i<50; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    BankUser bankUser = new BankUser(bank);
                    bankUser.withdrawMoney();
                }
            });
            thread.start();
        }
    }
}
