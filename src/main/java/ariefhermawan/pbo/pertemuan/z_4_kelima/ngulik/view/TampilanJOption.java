package ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.view;

import javax.swing.*;

public class TampilanJOption {

    public void tampilanMenuPilihanTidakAdaDiMenu() {
        String tampilanUtama =
                "Pilihan atau input anda tidak dimengerti, Program Berakhir.";
        JOptionPane.showInputDialog(tampilanUtama);
    }

    public String tampilanMenuPemilihanProgram() {
        String tampilanUtama =
                "Program Tugas Praktikum 3\n\n" +
                        "Pilih Menu Dibawah:\n\n" +
                        "1.Menghitung Luas Lingkaran\n" +
                        "2.Menghitung Luas Segitiga\n" +
                        "3.Menghitung volume prisma segitiga.\n\n";
        return JOptionPane.showInputDialog(tampilanUtama);
    }

    public String tampilanInputJariJariLingkaran() {
        String tampilanInputJariJariLingkaran =
                "Input jari-jari lingkaran: ";
        return JOptionPane.showInputDialog(tampilanInputJariJariLingkaran);
    }

    public String tampilanInputAlasSegitiga() {
        String tampilanInputAlasSegitiga =
                "Input alas segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputAlasSegitiga);
    }

    public String tampilanInputTinggiSegitiga() {
        String tampilanInputTinggiSegitiga =
                "Input tinggi segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputTinggiSegitiga);
    }

    public String tampilanInputAlasPrismaSegitiga() {
        String tampilanInputAlasPrismaSegitiga =
                "Input alas Prisma segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputAlasPrismaSegitiga);
    }

    public String tampilanInputTinggiPrismaSegitiga() {
        String tampilanInputTinggiPrismaSegitiga =
                "Input tinggi Prisma segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputTinggiPrismaSegitiga);
    }
}
