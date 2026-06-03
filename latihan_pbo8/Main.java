package latihan_pbo8;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new Persegi(4),
            new Segitiga(2, 3)
        };

        for (BangunDatar b : bd){
            b.Display();
            System.out.println("Luas: " + b.hitungLuas());
            System.out.println("----------------------------");
        }
    }
}