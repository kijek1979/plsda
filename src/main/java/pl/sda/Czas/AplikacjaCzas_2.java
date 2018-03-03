package pl.sda.Czas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AplikacjaCzas_2 {

    public static void main(String[] args) {

        LocalDate localDateTime = LocalDate.of(2018,9,23);
        LocalDate localDateTime1 = LocalDate.of(2018,3,4);
        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Period p = Period.between(localDateTime, localDateTime1);
        System.out.println(p);


        LocalDate localDateTimeNow = LocalDate.now();
        LocalDate myBirthDay = LocalDate.of(1979,4,23);
        Period mójWiek= Period.between(localDateTimeNow, myBirthDay);
        System.out.println(mójWiek);







    }

    public  static void dodajDate(){


    }
}
