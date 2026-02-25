package latihan_pbo2;

class PersegiPanjang {
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Tambahan method luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Tambahan method keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Main {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();
        p.setPanjang(9);
        p.setLebar(10);

        System.out.println("Panjang  : " + p.getPanjang());
        System.out.println("Lebar    : " + p.getLebar());
        System.out.println("Luas     : " + p.hitungLuas());
        System.out.println("Keliling : " + p.hitungKeliling());
    }
}
