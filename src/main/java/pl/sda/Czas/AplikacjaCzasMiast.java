package pl.sda.Czas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AplikacjaCzasMiast {

    public static void main(String[] args) {
        System.out.println("podaj miasto");
        Scanner scanner = new Scanner(System.in);
        String miasto = scanner.nextLine();


        ZoneId zoneIdWarsaw = ZoneId.of("Europe/Warsaw");
        LocalDateTime warszawa = LocalDateTime.now(zoneIdWarsaw);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
        System.out.println(warszawa.format(dateTimeFormatter));

        Map<String,String> zoneIds = new HashMap<>();
        zoneIds.put("Warszawa", "Europe/Warsaw");
        zoneIds.put("Paryż", "Europe/Paris");
        zoneIds.put("Whitehorse", "Etc/UTC");
        zoneIds.put("Moskwa", "Europe/Moscow");
        zoneIds.put("Canberra", "Australia/Sydney");
        zoneIds.put("Sosnowiec", "Europe/Warsaw");

        String zoneIdSet = zoneIds.get(miasto);
        //ZoneId zoneId = ZonedDateTime.now(ZoneId.of(zoneIdSet));
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(zoneIdSet));
        String koniec = "koniec";

        boolean flaga = true;

        while (flaga){
            if (zoneIdSet.equals("Warszawa")){
                System.out.println(dateTime);
            }else if (zoneIdSet.equals("Moskwa")){
                System.out.println(dateTime);
            }else if (zoneIdSet.equals("Paryż")) {
                System.out.println(dateTime);
            }   else if (zoneIdSet.equals("Whitehorse")) {
                System.out.println(dateTime);
            }else if (zoneIdSet.equals("Canberra")) {
                System.out.println(dateTime);
            }else if (zoneIdSet.equals("Sosnowiec")) {
                System.out.println(dateTime);
            }else if(miasto.equals("koniec")) {

                flaga = false;
            }
        }
    }
}
