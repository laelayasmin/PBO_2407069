import java.util.Scanner;

// ===== Abstract Class BangunDatar =====
abstract class BangunDatar {
    private String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void tampilHasil() {
        System.out.println("=============================");
        System.out.println("Bangun Datar : " + nama);
        System.out.printf("Luas         : %.2f%n", hitungLuas());
        System.out.printf("Keliling     : %.2f%n", hitungKeliling());
        System.out.println("=============================");
    }
}

// ===== Class Persegi =====
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    @Override
    public double hitungLuas() { return sisi * sisi; }

    @Override
    public double hitungKeliling() { return 4 * sisi; }
}

// ===== Class PersegiPanjang =====
class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar   = lebar;
    }

    public double getPanjang() { return panjang; }
    public double getLebar()   { return lebar; }

    @Override
    public double hitungLuas() { return panjang * lebar; }

    @Override
    public double hitungKeliling() { return 2 * (panjang + lebar); }
}

// ===== Class Lingkaran =====
class Lingkaran extends BangunDatar {
    private double jariJari;
    private static final double PI = 3.14159;

    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    public double getJariJari() { return jariJari; }
    public void setJariJari(double jariJari) { this.jariJari = jariJari; }

    @Override
    public double hitungLuas() { return PI * jariJari * jariJari; }

    @Override
    public double hitungKeliling() { return 2 * PI * jariJari; }
}

// ===== Main =====
public class tugas1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== KALKULATOR BANGUN DATAR =====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Pilih bangun datar: ");
            pilihan = sc.nextInt();

            BangunDatar b = null;

            if (pilihan == 1) {
                System.out.print("Masukkan sisi: ");
                double sisi = sc.nextDouble();
                b = new Persegi(sisi);

            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang: ");
                double panjang = sc.nextDouble();
                System.out.print("Masukkan lebar  : ");
                double lebar = sc.nextDouble();
                b = new PersegiPanjang(panjang, lebar);

            } else if (pilihan == 3) {
                System.out.print("Masukkan jari-jari: ");
                double r = sc.nextDouble();
                b = new Lingkaran(r);

            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

            if (b != null) {
                b.tampilHasil();
            }

        } while (pilihan != 0);

        sc.close();
    }
}
