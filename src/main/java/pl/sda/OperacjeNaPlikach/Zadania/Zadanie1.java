package pl.sda.OperacjeNaPlikach.Zadania;

import java.io.*;

public class Zadanie1 {

    public static void main(String[] args) throws IOException {

        File plik1 = new File("output_1.txt");


        plik1.createNewFile();

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(plik1))){
            writer.println("Hello world!");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(plik1.getName());
        plik1.canExecute();




    }
}
