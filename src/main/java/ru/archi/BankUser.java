package ru.archi;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Черный on 11.10.2017.
 */
public class BankUser {
    private ReentrantLock lock = new ReentrantLock();

    Bank bank = null;

    public BankUser(Bank bank){
        this.bank = bank;
    }

    public void withdrawMoney(){
        lock.lock();
        try {
            while (bank.hasMoney(10)) {
                bank.getMoney(10);
            }
        } finally {
            lock.unlock();
        }
    }
}
