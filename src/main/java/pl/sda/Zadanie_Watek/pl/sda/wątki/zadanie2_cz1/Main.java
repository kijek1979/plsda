package pl.sda.Zadanie_Watek.pl.sda.wątki.zadanie2_cz1;

import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {


        Worker[] worker = new Worker[3];
        worker[0] = new Worker("jarek");
        worker[1] = new Worker("marek");
        worker[2] = new Worker("darek");
        Thread wątek1 = new Thread(worker[0]);
        Thread wątek2 = new Thread(worker[1]);
        Thread wątek3 = new Thread(worker[2]);

        //ExecutorService pula = ExecutorService






        wątek1.start();

        wątek2.start();

        wątek3.start();


    }
}
