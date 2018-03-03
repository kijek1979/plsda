package pl.sda.OperacjeNaPlikach;

import java.io.File;

public class Początek {

    public static void main(String[] args) {
        File plik = new File("`/");
       if( plik.exists()){

           System.out.println("istnieje");
           System.out.println(plik.length());
           System.out.println("czy jest plikiem"+ plik.isFile());
           System.out.println();

        }

        File plik2 = new File("output).txt");
       //plik.createNewFile();


    }
}
