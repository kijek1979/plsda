package pl.sda.Zadanie_Watek;


public class ThreadingMain {
    public static void main(String[] args) {
//        Runnable obiekt = new Runnable() {
//            public void run() {
//
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Hello thread!");
//                }
//            }
//        };



        ThreadTask zadanie = new ThreadTask();
        Thread watek = new Thread(zadanie);

        watek.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello!");
        }
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        watek.interrupt();
    }
}