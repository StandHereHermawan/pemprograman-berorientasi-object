package ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.data;

import javax.swing.*;

public class Segitiga {

    private final double satuPerDua = 0.5;
    private double alas;
    private double tinggi;
    private double luas;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.hitungLuas();
    }

    private void hitungLuas() {
        this.luas = this.satuPerDua() * this.alas() * this.tinggi();
    }

    private double satuPerDua() {
        return this.satuPerDua;
    }

    private double alas() {
        return this.alas;
    }

    private double tinggi() {
        return this.tinggi;
    }

    public void tampilkanPropertiesLingkaranKeKonsol() {
        String tampilanHasilHitungBangunLingkaran =
                "Segitiga" +
                        "\n\tdengan konstanta 1/2\t: " + this.satuPerDua() +
                        "\n\tdengan alas\t\t\t\t: " + this.alas() +
                        "\n\tdengan tinggi\t\t\t: " + this.tinggi() +
                        "\n\tdengan luas\t\t\t\t: " + this.luas + ".";
        System.out.println(tampilanHasilHitungBangunLingkaran);
    }

    public Object tampilanHasilHitungBangunLingkaran() {
        String tampilanHasilHitungBangunLingkaran =
                "Segitiga" +
                        "\n\tdengan konstanta 1/2\t\t: " + this.satuPerDua() +
                        "\n\tdengan alas\t\t: " + this.alas() +
                        "\n\tdengan tinggi\t\t: " + this.tinggi() +
                        "\n\tdengan luas\t\t\t\t: " + this.luas + ".";
        return JOptionPane.showInputDialog(tampilanHasilHitungBangunLingkaran);
    }
}
