package pl.sda.Zadanie_Watek.pl.sda.wątki.zadanie2_cz1;

public class Worker implements Runnable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("praca rozpoczeta przez :"+getName());

        try {
            int time = 3000;
            Thread.sleep(time);
            System.out.println(getName()+" wyprodukował wkład przez " +(time/1000)+ " sek");
            time=2000;
            Thread.sleep(time);
            System.out.println(getName()+" wyprodukował obudowe przez "+ (time/1000)+ " sek");
            time = 1000;
           Thread.sleep(time);
            System.out.println(getName()+" złożył długopis przez "+ (time/1000)+ " sek");

        } catch (InterruptedException e) {
            e.printStackTrace();
            //System.out.println("interrupted!");
        }

    }








}
