package Latihan_PBO5;

public class Main {
    public static void main(String[] args) {

        // Data uji
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        // Buat objek BangunRuang
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        // Tampilkan hasil
        System.out.println("Luas Alas  : " + br.hitungLuas());
        System.out.println("Volume     : " + br.hitungVolume());
    }
}