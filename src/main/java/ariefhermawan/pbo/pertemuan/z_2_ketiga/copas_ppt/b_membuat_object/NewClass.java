package ariefhermawan.pbo.pertemuan.z_2_ketiga.copas_ppt.b_membuat_object;

class variabel /* Bukan best practice njr. */ {
    int lebar;
    int panjang;
}

public class NewClass {
    public static void main(String[] args) {
        double luas;
        variabel p = new variabel();
        p.panjang = 20;
        p.lebar = 10;
        luas = p.panjang * p.lebar;
        System.out.println("Luas persegi" + " \t" + ": " + luas);
    }
}
