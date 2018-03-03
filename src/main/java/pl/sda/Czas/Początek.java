package pl.sda.Czas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Początek {
    public static void main(String[] args) {
        Date d = new Date();
        //d.after();

        //ExecutorService executorService = Executors.newFixedThreadPool(5);
       LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(dt);
    }
}
