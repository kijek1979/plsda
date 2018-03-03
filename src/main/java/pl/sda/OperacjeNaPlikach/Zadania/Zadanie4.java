package pl.sda.OperacjeNaPlikach.Zadania;



import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String liniaTekstu = scanner.nextLine();

       File plik4 = new File(liniaTekstu);
//
//        plik4.createNewFile();

        if(plik4.exists()){
            System.out.println(liniaTekstu+" istnieje");
        } if (plik4.isFile()){
            System.out.println(liniaTekstu+" jes plikiem");
        } if (plik4.canRead()){
            System.out.println("plik "+liniaTekstu+" mozna odczytac");
        }if (plik4.canWrite()){
            System.out.println("w pliku "+liniaTekstu+" mozna wpisywac");
        }


        Timestamp t = new Timestamp(plik4.lastModified());
        LocalDateTime ldt = LocalDateTime.ofInstant(t.toInstant(), ZoneId.of("Europe/Warsaw"));


        System.out.println("rozmiar pliku "+liniaTekstu+" to "+plik4.length());
        System.out.println("ostatnia modyfikacja pliku "+liniaTekstu+" była " +t);
        System.out.println(plik4.toPath());
    }
}
