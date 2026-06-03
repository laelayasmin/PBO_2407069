package Latihan_PBO5;

public class BangunDatar {

    private double panjang;
    private double lebar;

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar * 2;
    }
}