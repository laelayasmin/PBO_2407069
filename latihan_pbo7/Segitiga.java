package latihan_pbo7;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("========================");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("========================");
    }
}