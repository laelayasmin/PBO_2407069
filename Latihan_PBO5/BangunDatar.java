package Latihan_PBO5;

public class BangunDatar {

    // (b) Enkapsulasi: atribut private
    private double panjang;
    private double lebar;

    // (c) Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter (diperlukan agar subclass bisa mengakses)
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // (d) Method hitungLuas
    public double hitungLuas() {
        return panjang * lebar;
    }
}