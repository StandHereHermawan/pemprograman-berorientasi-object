package ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.app;

import ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.data.Lingkaran;
import ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.data.PrismaSegitiga;
import ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.data.Segitiga;
import ariefhermawan.pbo.pertemuan.z_4_kelima.ngulik.view.TampilanJOption;

import javax.swing.*;

public class Application {
    private Lingkaran lingkaran;
    private Segitiga segitiga;
    private PrismaSegitiga prismaSegitiga;
    private TampilanJOption tampilanJOption;

    public static void main(String[] args) {
        Application application = new Application();
        application.tampilanJOption = new TampilanJOption();

        ///  <pre>
        ///         String tampilanUtama =
        ///                 "Program Tugas Praktikum 3\n\n" +
        ///                         "Pilih Menu Dibawah:\n\n" +
        ///                         "1.Menghitung Luas Lingkaran\n" +
        ///                         "2.Menghitung Luas Segitiga\n" +
        ///                         "3.Menghitung volume prisma segitiga.\n\n";
        ///         JOptionPane.showInputDialog(tampilanUtama);
        ///  </pre>
        String pilihanMenu = application.tampilanJOption.tampilanMenuPemilihanProgram();

        switch (pilihanMenu) {
            case "1":
                /// <pre>
                ///         String tampilanInputJariJariLingkaran =
                ///                 "Input jari-jari lingkaran: ";
                ///         JOptionPane.showInputDialog(tampilanInputJariJariLingkaran);
                /// </pre>
                String nilaiInput = application.tampilanJOption.tampilanInputJariJariLingkaran();

                try {
                    application.lingkaran = new Lingkaran(Double.parseDouble(nilaiInput));
                    application.lingkaran.tampilanHasilHitungBangunLingkaran();
                } catch (RuntimeException exception) {
                    application.tampilanJOption.tampilanMenuPilihanTidakAdaDiMenu();
                    throw new RuntimeException(exception);
                }
                break;

            case "2":
                /// <pre>
                ///         String tampilanInputAlasSegitiga =
                ///                 "Input alas segitiga: ";
                ///         JOptionPane.showInputDialog(tampilanInputAlasSegitiga);
                /// </pre>
                String nilaiInputAlasSegitiga = application.tampilanJOption.tampilanInputAlasSegitiga();
                /// <pre>
                ///        String tampilanInputTinggiSegitiga =
                ///                "Input tinggi segitiga: ";
                ///        JOptionPane.showInputDialog(tampilanInputTinggiSegitiga);
                /// </pre>
                String nilaiInputTinggiSegitiga = application.tampilanJOption.tampilanInputTinggiSegitiga();

                try {
                    application.segitiga = new Segitiga(
                            Double.parseDouble(nilaiInputAlasSegitiga),
                            Double.parseDouble(nilaiInputTinggiSegitiga)
                    );
                    application.segitiga.tampilanHasilHitungBangunLingkaran();
                } catch (RuntimeException e) {
                    application.tampilanJOption.tampilanMenuPilihanTidakAdaDiMenu();
                    throw new RuntimeException(e);
                }
                break;

            case "3":
                /// <pre>
                ///        String tampilanInputTinggiPrismaSegitiga =
                ///                "Input tinggi Prisma segitiga: ";
                ///        JOptionPane.showInputDialog(tampilanInputTinggiPrismaSegitiga);
                /// </pre>
                String nilaiInputTinggiPrisma = application.tampilanJOption.tampilanInputTinggiPrismaSegitiga();
                String nilaiInputAlasPrisma = application.tampilanJOption.tampilanInputAlasPrismaSegitiga();

                try {
                    application.prismaSegitiga = new PrismaSegitiga(
                            Double.parseDouble(nilaiInputAlasPrisma),
                            Double.parseDouble(nilaiInputTinggiPrisma)
                    );
                    application.prismaSegitiga.tampilkanPropertiesPrismaKeJOption();
                } catch (RuntimeException e) {
                    application.tampilanJOption.tampilanMenuPilihanTidakAdaDiMenu();
                    throw new RuntimeException(e);
                }
                break;

            default:
                ///         String tampilanUtama =
                ///                 "Pilihan anda tidak dimengerti, Program Berakhir.";
                ///         JOptionPane.showInputDialog(tampilanUtama);
                application.tampilanJOption.tampilanMenuPilihanTidakAdaDiMenu();
                break;
        }
    }
}
