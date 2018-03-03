package pl.sda.pl.sda.Mapy.pl.sda.Mapy.Zadanie1;

public class Student {

    private  long numerIndeksu;
    private String imie;
    private String nazwisko;

    public long getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Student( String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student: imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
