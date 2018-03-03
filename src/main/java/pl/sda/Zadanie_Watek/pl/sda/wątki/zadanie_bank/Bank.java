package pl.sda.Zadanie_Watek.pl.sda.wątki.zadanie_bank;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    private BankAccount account = new BankAccount();
    private ExecutorService serwery = Executors.newFixedThreadPool(5);

    public void subtractFromAccount(double howMuch){
        // zlecenie przelewu
        ZleceniePrzelewu zleceniePrzelewu = new ZleceniePrzelewu(account, howMuch, KierunekPrzelewu.SUB);
        serwery.submit(zleceniePrzelewu);

//        account.sub(howMuch);
    }

    public void addToAccount(double howMuch){
        // zlecenie przelewu
        ZleceniePrzelewu zleceniePrzelewu = new ZleceniePrzelewu(account, howMuch, KierunekPrzelewu.ADD);
        serwery.submit(zleceniePrzelewu);

//        account.add(howMuch);
    }

    public void balanceAccount(){
        account.balance();
    }

    public void shutdown(){
        serwery.shutdown();
    }
}
