package pl.sda.Zadanie_Watek;

public class ThreadTask implements Runnable {

    private boolean isWorking;
    public void run() {
        isWorking = true;

        while (isWorking){
            try {
                System.out.println("Hello world!");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("interrupted!");
            }
        }
    }
    public void stopTask(){
        isWorking = false;
    }
}