package ariefhermawan.pbo.pertemuan.z_2_ketiga.copas_ppt.c_membuat_method;

class kali /* Bukan best practice njr. */ {
    double a;
    double b;

    void hasil() {
        System.out.println(
                "Hasil perkalian dari" + "\n" + "\t" +
                        "Nilai a" + "\t\t" + ": " + this.a + "\n" + "\t" +
                        "Nilai b" + "\t\t" + ": " + this.b + "\n" + "\t" +
                        "Hasil-nya" + "\t" + ": " + (this.a * this.b)
        );
    }
}

public class HasilPerkalian {
    public static void main(String[] args) {
        kali variabel1, variabel2;

        variabel1 = new kali();
        variabel2 = new kali();

        variabel1.a = 3;
        variabel1.b = 6;

        variabel2.a = 5;
        variabel2.b = 10;

        variabel1.hasil();
        variabel2.hasil();
    }
}
