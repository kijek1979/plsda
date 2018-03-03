package pl.sda.Zadanie_Watek.pl.sda.wątki.zadanie_bank;

import java.util.Scanner;

public class ZleceniePrzelewu implements Runnable {
    private BankAccount konto;
    private double howMuch;
    private KierunekPrzelewu kierunek;

    public ZleceniePrzelewu(BankAccount konto, double howMuch, KierunekPrzelewu kierunek) {
        this.konto = konto;
        this.howMuch = howMuch;
        this.kierunek = kierunek;
    }

    //@Override
    public void run() {
        // odejmowanie dodawanie z konta lub na konto
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.prinatStackTrace();
//        }

        if (kierunek == KierunekPrzelewu.SUB) {
            konto.sub(howMuch);
        } else if (kierunek == KierunekPrzelewu.ADD) {
            konto.add(howMuch);
        }
    }
}
