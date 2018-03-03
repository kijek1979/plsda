package pl.sda.OperacjeNaPlikach.Zadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie2_2{

    public static void main(String[] args) {
        File plik = new File("output_2.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(plik))){
            String linia =  bufferedReader.readLine();
            System.out.println(linia.toUpperCase());
            System.out.println(linia.toLowerCase());
            System.out.println(linia.trim());



        }catch (IOException e){
            e.printStackTrace();
            System.out.println("nie ma takiego pliku");
        }
    }


}
