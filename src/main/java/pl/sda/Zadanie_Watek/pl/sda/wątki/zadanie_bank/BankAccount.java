package pl.sda.Zadanie_Watek.pl.sda.wątki.zadanie_bank;
public class BankAccount {
    private double balance = 0.0;
    private final Object lock = new Object();

    // w metode moze wejsc 1 watek
    public synchronized void add(double howMuch) {
        synchronized (lock) {
            balance = balance + howMuch;
        }
    }

    // w metode moze wejsc 1 watek
    public synchronized void sub(double howMuch) {
        synchronized (lock) {
            balance = balance - howMuch;
        }
    }

    public void balance() {
        System.out.println(balance);
    }
}
