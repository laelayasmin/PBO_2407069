package latihan_mandiri;

public class MenuItem extends Menu {

    private String nama;
    private double harga;
    private int jumlah;

















    ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\\\\\\\\\\\\\\\\\\
    

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama);
        this.nama   = nama;
        this.harga  = harga;
        this.jumlah = jumlah;
    }

    public String getNama()  { return nama; }
    public double getHarga() { return harga; }
    public int getJumlah()   { return jumlah; }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println("------------------------");
        System.out.println("Nama   : " + nama);
        System.out.println("Harga  : Rp " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : Rp " + hitungTotal());
    }
}