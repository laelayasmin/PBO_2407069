package latihan_pbo8;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // abstract method
    abstract double hitungLuas();

    public void Display() {
        System.out.println("ini adalah: " + nama);
    }
}