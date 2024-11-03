package ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data;

import javax.swing.*;

public class PrismaSegitiga {
    private final double satuPerDua = 0.5;
    private double alas;
    private double tinggi;
    private double volume;

    public PrismaSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.hitungVolume();
    }

    private void hitungVolume() {
        final double hasilOperasiKurung = this.satuPerDua() * this.alas() * this.tinggi();
        this.volume = hasilOperasiKurung * this.tinggi;
    }

    protected double satuPerDua() {
        return this.satuPerDua;
    }

    protected double alas() {
        return this.alas;
    }

    protected double tinggi() {
        return this.tinggi;
    }

    protected void tampilkanPropertiesPrismaKeKonsole() {
        String tampilan =
                "Prisma\n\tdengan konstanta 1/2\t: " + this.satuPerDua +
                        "\n\tdengan alas\t\t\t\t: " + this.alas +
                        "\n\tdengan tinggi\t\t\t: " + this.tinggi +
                        "\n\tdengan volume\t\t\t: " + this.volume + ".";
        System.out.println(tampilan);
    }

    public Object tampilkanPropertiesPrismaKeJOption() {
        String tampilan =
                "Prisma\n\tdengan konstanta 1/2\t: " + this.satuPerDua +
                        "\n\tdengan alas\t\t\t\t: " + this.alas +
                        "\n\tdengan tinggi\t\t\t: " + this.tinggi +
                        "\n\tdengan volume\t\t\t: " + this.volume + ".";
        return JOptionPane.showInputDialog(tampilan);
    }
}