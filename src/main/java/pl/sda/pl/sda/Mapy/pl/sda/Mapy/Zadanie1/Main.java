package pl.sda.pl.sda.Mapy.pl.sda.Mapy.Zadanie1;



import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Long, Student> studentMap = new HashMap();

        Student student1 = new Student(100100);
        Student student2 = new Student (100200);
        Student student3 = new Student (100300);
        Student student4 = new Student (100400);



        studentMap.put(student1.getNumerIndeksu(), new Student( "jarek", "kijko"));
        studentMap.put(student2.getNumerIndeksu(), new Student( "marek", "januszewicz"));
        studentMap.put(student3.getNumerIndeksu(), new Student("wacwk", "klon"));
        studentMap.put(student4.getNumerIndeksu(), new Student( "franek", "kimono"));

        System.out.println(studentMap.get(100400L));

        System.out.println(studentMap.entrySet());
        System.out.println("liczba studentów "+studentMap.size());





    }
}
