package latihan_pbo7;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        super(sisi);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("========================");
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("========================");
    }
}