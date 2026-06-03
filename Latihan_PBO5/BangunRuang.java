package Latihan_PBO5;

public class BangunRuang extends BangunDatar {

    private double tinggi;

    // super() → memanggil constructor parent
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);   // ← memanggil BangunDatar(panjang, lebar)
        this.tinggi = tinggi;
    }

    public double getTinggi() { return tinggi; }

    // @Override → menimpa hitungLuas() milik parent
    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas(); // ← pakai hitungLuas() dari parent
        return 2 * (luasAlas + getPanjang() * tinggi + getLebar() * tinggi);
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi; // luas alas × tinggi
    }
}