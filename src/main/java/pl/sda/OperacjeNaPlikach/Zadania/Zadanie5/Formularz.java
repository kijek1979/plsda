package pl.sda.OperacjeNaPlikach.Zadania.Zadanie5;

import java.io.*;
import java.util.Scanner;

public class Formularz {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);


        File outputForm = new File("ouput_form.txt");

        outputForm.createNewFile();

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(outputForm))) {

            System.out.println("podaj wiek");
            int wiek = scanner.nextInt();
            writer.println("wiek");
            writer.println(wiek);

            System.out.println("podaj wzrost");
            int wzrost = scanner.nextInt();
            writer.println("wzrost");
            writer.println(wzrost);

            System.out.println("podaj zarobki");
            int zarobki = scanner.nextInt();
            writer.println("zarobki");
            writer.println(zarobki);
            scanner.nextLine();

            System.out.println("kobieta/mężczyzna?");
            String płeć = scanner.nextLine();
            writer.println("kobieta/mężczyzan?");
            writer.println(płeć);

            System.out.println("miejsce urodzenia");
            String miejsceUrodzenia = scanner.nextLine();
            writer.println("miejsce urodzenia");
            writer.println(miejsceUrodzenia);

            System.out.println("miejsce zamieszkania");
            String adres = scanner.nextLine();
            writer.println("miejsce zamieszkania");
            writer.println(adres);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
