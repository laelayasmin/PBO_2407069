package Latihan_PBO5;

public class BangunRuang extends BangunDatar {

    // Atribut tambahan
    private double tinggi;

    // Constructor: panggil constructor parent dengan super()
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // memanggil constructor BangunDatar
        this.tinggi = tinggi;
    }

    // Method hitungVolume: REUSE hitungLuas() dari parent
    public double hitungVolume() {
        return hitungLuas() * tinggi; // tidak mengulang kode!
    }
}