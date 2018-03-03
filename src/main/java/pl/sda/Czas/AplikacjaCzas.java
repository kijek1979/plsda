package pl.sda.Czas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AplikacjaCzas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDate = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter tajm = DateTimeFormatter.ofPattern("HH-mm-ss");



        boolean flaga = true;


        while (flaga){
            String time = scanner.nextLine();
            if(time.equals("time")){
                System.out.println(localTime.format(tajm));
                System.out.println("program kończy słowo  \"quit\" ");
            }else if (time.equals("date")){
                System.out.println(localDate.format(date));
                System.out.println("program kończy słowo  \"quit\" ");
            }else if(time.equals("datetime")){
                System.out.println(localDateTime.format(datetime));
                System.out.println("program kończy słowo  \"quit\" ");
            }else if(time.equals("quit")){
                System.out.println("koniec programu");
                break;
            }

        }




    }

}
