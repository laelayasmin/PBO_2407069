package tugas_pbo;

import java.util.Scanner;

class Cafe {
    private String nama;
    private int bahan1; // teh (ml)
    private int bahan2; // susu (ml)
    private int bahan3; // sirup (ml)

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getBahan1() { return bahan1; }
    public void setBahan1(int bahan1) { this.bahan1 = bahan1; }

    public int getBahan2() { return bahan2; }
    public void setBahan2(int bahan2) { this.bahan2 = bahan2; }

    public int getBahan3() { return bahan3; }
    public void setBahan3(int bahan3) { this.bahan3 = bahan3; }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cafe cafe = new Cafe();

        System.out.print("Nama Cafe: ");
        cafe.setNama(sc.nextLine());

        System.out.print("Takaran Teh (ml): ");
        cafe.setBahan1(sc.nextInt());

        System.out.print("Takaran Susu (ml): ");
        cafe.setBahan2(sc.nextInt());

        System.out.print("Takaran Sirup (ml): ");
        cafe.setBahan3(sc.nextInt());

        int teh   = cafe.getBahan1();
        int susu  = cafe.getBahan2();
        int sirup = cafe.getBahan3();

        System.out.println("\n=== Hasil Analisis Minuman Boba ===");
        System.out.println("Cafe: " + cafe.getNama());

        if (teh > susu) {
            if (teh > sirup) {
                System.out.println("Minuman: Teh Boba");
                System.out.println("Keterangan: Dominan teh, cocok untuk classic boba tea");
            } else {
                System.out.println("Minuman: Teh Boba Manis");
                System.out.println("Keterangan: Teh lebih banyak dari susu, tapi sirup lebih dominan");
            }
        } else if (susu > teh) {
            if (susu > sirup) {
                System.out.println("Minuman: Milk Tea Boba");
                System.out.println("Keterangan: Dominan susu, cocok untuk milk tea");
            } else {
                if (teh > 0 && susu > 0) {
                    System.out.println("Minuman: Brown Sugar Boba");
                    System.out.println("Keterangan: Sirup dominan dengan campuran teh dan susu");
                } else {
                    System.out.println("Minuman: Tidak dikenali");
                }
            }
        } else {
            System.out.println("Minuman: Taro Milk Tea Boba");
            System.out.println("Keterangan: Teh dan susu seimbang, pas untuk taro milk tea");
        }

        System.out.println("Komposisi: " + teh + "ml teh, "
                         + susu + "ml susu, " + sirup + "ml sirup");

        sc.close();
    }
}