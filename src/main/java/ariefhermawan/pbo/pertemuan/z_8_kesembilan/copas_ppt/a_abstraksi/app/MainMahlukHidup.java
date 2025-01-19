package ariefhermawan.pbo.pertemuan.z_8_kesembilan.copas_ppt.a_abstraksi.app;

public class MainMahlukHidup {
    public void cekMahlukHidup(MahlukHidup mahlukHidup) {
        mahlukHidup.berdiri();
    }

    public static void main(String[] args) {
        MainMahlukHidup mainMahlukHidup = new MainMahlukHidup();
        mainMahlukHidup.cekMahlukHidup(new Manusia("Dua Kaki"));
    }
}

abstract class MahlukHidup {
    public abstract void berdiri();
}

class Manusia extends MahlukHidup {
    private String duaKaki;
    private String bernafas;

    public Manusia(String duaKaki) {
        this.duaKaki = duaKaki;
        this.bernafas = "Bernafas";
    }

    public void berdiri() {
        System.out.println("Manusia berdiri menggunakan : " + duaKaki);
        System.out.println("Manusia sebagai MahlukHidup : " + bernafas);
    }
}
