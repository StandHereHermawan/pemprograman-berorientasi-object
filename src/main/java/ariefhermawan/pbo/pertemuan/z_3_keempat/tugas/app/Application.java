package ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.app;

import ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data.Lingkaran;
import ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data.PrismaSegitiga;
import ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data.Segitiga;

import javax.swing.*;

public class Application {
    private Lingkaran lingkaran;
    private Segitiga segitiga;
    private PrismaSegitiga prismaSegitiga;

    public static void main(String[] args) {
        Application application = new Application();

        ///  <pre>
        ///         String tampilanUtama =
        ///                 "Program Tugas Praktikum 3\n\n" +
        ///                         "Pilih Menu Dibawah:\n\n" +
        ///                         "1.Menghitung Luas Lingkaran\n" +
        ///                         "2.Menghitung Luas Segitiga\n" +
        ///                         "3.Menghitung volume prisma segitiga.\n\n";
        ///         JOptionPane.showInputDialog(tampilanUtama);
        ///  </pre>
        String pilihanMenu = tampilanMenuPemilihanProgram();

        switch (pilihanMenu) {
            case "1":
                /// <pre>
                ///         String tampilanInputJariJariLingkaran =
                ///                 "Input jari-jari lingkaran: ";
                ///         JOptionPane.showInputDialog(tampilanInputJariJariLingkaran);
                /// </pre>
                String nilaiInput = tampilanInputJariJariLingkaran();

                try {
                    application.lingkaran = new Lingkaran(Double.parseDouble(nilaiInput));
                    application.lingkaran.tampilanHasilHitungBangunLingkaran();
                } catch (RuntimeException exception) {
                    tampilanMenuPilihanTidakAdaDiMenu();
                    throw new RuntimeException(exception);
                }
                break;

            case "2":
                /// <pre>
                ///         String tampilanInputAlasSegitiga =
                ///                 "Input alas segitiga: ";
                ///         JOptionPane.showInputDialog(tampilanInputAlasSegitiga);
                /// </pre>
                String nilaiInputAlasSegitiga = tampilanInputAlasSegitiga();
                /// <pre>
                ///        String tampilanInputTinggiSegitiga =
                ///                "Input tinggi segitiga: ";
                ///        JOptionPane.showInputDialog(tampilanInputTinggiSegitiga);
                /// </pre>
                String nilaiInputTinggiSegitiga = tampilanInputTinggiSegitiga();

                try {
                    application.segitiga = new Segitiga(
                            Double.parseDouble(nilaiInputAlasSegitiga),
                            Double.parseDouble(nilaiInputTinggiSegitiga)
                    );
                    application.segitiga.tampilanHasilHitungBangunLingkaran();
                } catch (RuntimeException e) {
                    tampilanMenuPilihanTidakAdaDiMenu();
                    throw new RuntimeException(e);
                }
                break;

            case "3":
                /// <pre>
                ///        String tampilanInputTinggiPrismaSegitiga =
                ///                "Input tinggi Prisma segitiga: ";
                ///        JOptionPane.showInputDialog(tampilanInputTinggiPrismaSegitiga);
                /// </pre>
                String nilaiInputTinggiPrisma = tampilanInputTinggiPrismaSegitiga();
                String nilaiInputAlasPrisma = tampilanInputAlasPrismaSegitiga();

                try {
                    application.prismaSegitiga = new PrismaSegitiga(
                            Double.parseDouble(nilaiInputAlasPrisma),
                            Double.parseDouble(nilaiInputTinggiPrisma)
                    );
                    application.prismaSegitiga.tampilkanPropertiesPrismaKeJOption();
                } catch (RuntimeException e) {
                    tampilanMenuPilihanTidakAdaDiMenu();
                    throw new RuntimeException(e);
                }
                break;

            default:
                ///         String tampilanUtama =
                ///                 "Pilihan anda tidak dimengerti, Program Berakhir.";
                ///         JOptionPane.showInputDialog(tampilanUtama);
                tampilanMenuPilihanTidakAdaDiMenu();
                break;
        }
    }

    public static void tampilanMenuPilihanTidakAdaDiMenu() {
        String tampilanUtama =
                "Pilihan atau input anda tidak dimengerti, Program Berakhir.";
        JOptionPane.showInputDialog(tampilanUtama);
    }

    public static String tampilanMenuPemilihanProgram() {
        String tampilanUtama =
                "Program Tugas Praktikum 3\n\n" +
                        "Pilih Menu Dibawah:\n\n" +
                        "1.Menghitung Luas Lingkaran\n" +
                        "2.Menghitung Luas Segitiga\n" +
                        "3.Menghitung volume prisma segitiga.\n\n";
        return JOptionPane.showInputDialog(tampilanUtama);
    }

    public static String tampilanInputJariJariLingkaran() {
        String tampilanInputJariJariLingkaran =
                "Input jari-jari lingkaran: ";
        return JOptionPane.showInputDialog(tampilanInputJariJariLingkaran);
    }

    public static String tampilanInputAlasSegitiga() {
        String tampilanInputAlasSegitiga =
                "Input alas segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputAlasSegitiga);
    }

    public static String tampilanInputTinggiSegitiga() {
        String tampilanInputTinggiSegitiga =
                "Input tinggi segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputTinggiSegitiga);
    }

    public static String tampilanInputAlasPrismaSegitiga() {
        String tampilanInputAlasPrismaSegitiga =
                "Input alas Prisma segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputAlasPrismaSegitiga);
    }

    public static String tampilanInputTinggiPrismaSegitiga() {
        String tampilanInputTinggiPrismaSegitiga =
                "Input tinggi Prisma segitiga: ";
        return JOptionPane.showInputDialog(tampilanInputTinggiPrismaSegitiga);
    }
}
