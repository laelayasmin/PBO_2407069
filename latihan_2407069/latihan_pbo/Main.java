package latihan_pbo;

class Cafe {
    private String nama;
    private String alamat;

    // Constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Method
    void buka() {
        System.out.println("Cafe " + nama + " sudah buka!");
        System.out.println("Alamat: " + alamat);
        System.out.println("====================");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DAFTAR CAFE ===\n");

        Cafe cafe1 = new Cafe("Kenangan", "IMKOT");
        Cafe cafe2 = new Cafe("Janji Jiwa", "Cirebon");
        Cafe cafe3 = new Cafe("Kopi Lain Hati", "Indramayu");

        cafe1.buka();
        cafe2.buka();
        cafe3.buka();
    }
}