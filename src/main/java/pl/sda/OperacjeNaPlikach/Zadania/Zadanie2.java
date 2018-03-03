package pl.sda.OperacjeNaPlikach.Zadania;

import java.io.*;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) throws IOException {

        File plik2 = new File("output_2.txt");

        plik2.createNewFile();

        Scanner scanner = new Scanner(System.in);
        String wpisanyTekst = scanner.nextLine();

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(plik2))){
            writer.println(wpisanyTekst);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
