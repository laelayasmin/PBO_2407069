package latihan_mandiri;

import java.util.ArrayList;

public class Menu {

    private String namaMenu;
    private ArrayList<MenuItem> daftarItem;

    // Constructor
    public Menu(String namaMenu) {
        this.namaMenu   = namaMenu;
        this.daftarItem = new ArrayList<>();
    }

    // Tambah item ke menu
    public void tambahItem(MenuItem item) {
        daftarItem.add(item);
    }

    // Cek apakah menu item ada
    public boolean adaItem() {
        return !daftarItem.isEmpty();
    }

    // Hitung total harga semua item
    public double hitungTotal() {
        double total = 0;
        for (MenuItem item : daftarItem) {
            total += item.getHarga();
        }
        return total;
    }

    // Tampilkan semua isi menu
    public void tampilkan() {
        System.out.println("========================");
        System.out.println("   " + namaMenu);
        System.out.println("========================");

        if (!adaItem()) {
            System.out.println("(Menu masih kosong)");
        } else {
            for (MenuItem item : daftarItem) {
                item.tampilkan();
            }
            System.out.println("------------------------");
            System.out.println("Total: Rp " + hitungTotal());
        }

        System.out.println("========================");
    }
}