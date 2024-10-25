package ariefhermawan.pbo.pertemuan.z_2_ketiga.copas_ppt.d_membuat_constructor;

class konstruktor {
    int panjang;
    int lebar;

    konstruktor() {
        panjang = 15;
        lebar = 4;
    }

    int luas() {
        return (this.panjang * this.lebar);
    }
}

public class hitung {
    public static void main(String[] args) {
        konstruktor k1, k2;

        k1 = new konstruktor();
        k2 = new konstruktor();

        System.out.println("Luas persegi panjang k1: "+ k1.luas());
        System.out.println("Luas persegi panjang k2: "+ k2.luas());
    }
}
