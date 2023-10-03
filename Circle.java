/**
 * kelas Circle menggambarkan sebuah lingkaran dengan Jari Jari dan warna.
 */
public class Circle {
    // Variabel instan privat 
    private double Jarijari;
    private String Warna;
 
    // Konstruktor (di-overload)
    /**Membuat sebuah instance lingkaran dengan radius dan warna default*/
    public Circle() {                   // konstruktor pertama  (konstruktor default)
       Jarijari = 1.0;
       Warna = "Merah";
    }
    /** Membuat sebuah instance lingkaran dnegan radius tertentu dan warna default*/
    public Circle(double r) {           // konstruktor kedua
       Jarijari = r;
       Warna = "Merah";
    }
    /** Membuat sebua instance lingkaran dengan radius dan warna tertentu */
    public Circle(double r, String c) { // konstruktor ketiga
       Jarijari = r;
       Warna = c;
    }
 
    // Metode public
    /** mengembalikan nilai dan jari jari */
    public double getJarijari() {  // getter untuk Jari Jari 
       return Jarijari;
    }
    /** Mengembalikan nilai warna  */
    public String getWarna() {   // getter untuk warna
       return Warna;
    }
    /** Mengembalikan luas dan lningkaran  */
    public double getLuas() {
       return Jarijari * Jarijari * Math.PI;
    }
 }