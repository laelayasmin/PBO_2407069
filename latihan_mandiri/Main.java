package latihan_mandiri;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("Daftar Menu");

        // nama, harga, jumlah
        menu.tambahItem(new MenuItem("Nasi Goreng",  15000, 3));
        menu.tambahItem(new MenuItem("Soto Bandung",  8000, 2));
        menu.tambahItem(new MenuItem("Ayam Bakar",   20000, 1));
        menu.tambahItem(new MenuItem("Es Teh Manis",  5000, 4));

        System.out.println("Menu ada? " + menu.adaItem());
        menu.tampilkan();
    }
}