package ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.data;

import javax.swing.*;

public class Lingkaran {

    final double PI = Math.PI;
    double jariJari;
    double luas;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        this.hitungLuas();
    }

    private void hitungLuas() {
        this.luas = this.PI * Math.pow(this.jariJari, 2);
    }

    public void tampilkanPropertiesLingkaranKeKonsol() {
        String tampilanHasilHitungBangunLingkaran =
                "Lingkaran" +
                        "\n\tdengan konstanta PI\t\t: " + this.PI +
                        "\n\tdengan jari-jari\t\t: " + this.jariJari +
                        "\n\tdengan luas\t\t\t\t: " + this.luas + ".";
        System.out.println(tampilanHasilHitungBangunLingkaran);
    }

    public Object tampilanHasilHitungBangunLingkaran() {
        String tampilanHasilHitungBangunLingkaran =
                "Lingkaran\n\tdengan konstanta PI\t\t: " + this.PI +
                        "\n\tdengan jari-jari\t\t: " + this.jariJari +
                        "\n\tdengan luas\t\t\t\t: " + this.luas + ".";
        return JOptionPane.showInputDialog(tampilanHasilHitungBangunLingkaran);
    }
}
