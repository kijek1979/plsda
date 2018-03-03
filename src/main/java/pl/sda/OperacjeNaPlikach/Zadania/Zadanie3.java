package pl.sda.OperacjeNaPlikach.Zadania;

import java.io.*;
import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) throws IOException {



        File plik3 = new File("output_3.txt");

        plik3.createNewFile();

        Scanner scanner = new Scanner(System.in);


        try(PrintWriter writer = new PrintWriter(new FileOutputStream(plik3))){
            boolean flaga = true;
            while (flaga){
                String wpisanyTekst = scanner.nextLine();
                writer.println(wpisanyTekst);
                //writer.flush();
                if(wpisanyTekst.equals("quit")){
                    break;
                }

                    //flaga = false;
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
