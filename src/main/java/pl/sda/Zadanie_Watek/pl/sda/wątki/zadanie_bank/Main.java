package pl.sda.Zadanie_Watek.pl.sda.wątki.zadanie_bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10000; i++) {
            if(i%2 == 0){
                bank.addToAccount(10);
            }else{
                bank.subtractFromAccount(10);
            }
        }

        boolean isWorking = true;
        while (isWorking){
            String line = sc.nextLine();
            if(line.equals("balance")){
                bank.balanceAccount();
            }
        }
    }
}