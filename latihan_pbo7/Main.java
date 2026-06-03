package latihan_pbo7;

public class Main {
    public static void main(String[] args) {
        // Gunakan satu tipe variabel yang sama (BangunDatar) untuk menyimpan berbagai objek
        BangunDatar[] bangunDatar = new BangunDatar[3];

        bangunDatar[0] = new Persegi(5);
        bangunDatar[1] = new PersegiPanjang(6, 4);
        bangunDatar[2] = new Segitiga(8, 3);

        // Tampilkan semua bangun datar
        for (BangunDatar b : bangunDatar) {
            b.tampilkan();
            System.out.println();
        }
    }
}