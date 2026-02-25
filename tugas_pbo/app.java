package tugas_pbo;

public class app {
    public static void main(String[] args) {
        
        Cafe cafe = new Cafe();
        
        cafe.setNama("Boba House");
        cafe.setBahan1(100); // teh (ml)
        cafe.setBahan2(100); // susu (ml)
        cafe.setBahan3(50);  // sirup (ml)

        int teh   = cafe.getBahan1();
        int susu  = cafe.getBahan2();
        int sirup = cafe.getBahan3();

        System.out.println("Nama Cafe : " + cafe.getNama());
        System.out.println("Teh       : " + teh + " ml");
        System.out.println("Susu      : " + susu + " ml");
        System.out.println("Sirup     : " + sirup + " ml");

        System.out.println("\n=== Hasil Analisis Minuman Boba ===");

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
    }
}