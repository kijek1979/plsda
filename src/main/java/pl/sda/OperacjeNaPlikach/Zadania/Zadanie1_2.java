package pl.sda.OperacjeNaPlikach.Zadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nawe pliku");
        String nazwaPliku = scanner.nextLine();
        File plik = new File(nazwaPliku);

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(plik))){
            String linia =  bufferedReader.readLine();

            if(plik.exists()) {
                System.out.print("plik istnieje");
                while (linia != null) {
                    if (linia.equals("Hello world!")) {
                        System.out.println(" i posiada napis Hello world");
                        break;
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("nie ma takiego pliku");
        }
    }
}
