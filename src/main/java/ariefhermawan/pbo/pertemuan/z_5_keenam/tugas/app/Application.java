package ariefhermawan.pbo.pertemuan.z_5_keenam.tugas.app;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int pilihanMenu = 0;
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        Scanner scanner = new Scanner(System.in);
        Application application = new Application();


        try {
            pilihanMenu = application.tampilkanHalamanUtama(scanner);
        } catch (IOException | InputMismatchException e) {}
        switch (pilihanMenu) {
            case 1:
                try {
                    try {
                        a = application.masukkanNilaiMatriks2D(scanner);
                        application.tampilkanIsiMatriksKeConsole("X", a);
                        b = application.masukkanNilaiMatriks2D(scanner);
                        application.tampilkanIsiMatriksKeConsole("Y", b);
                        c = application.perkalianNilaiMatriks2DDenganOrdo2x2(a, b);
                        application.tampilkanIsiMatriksKeConsole("Z", c);
                    } catch (IOException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException e) {}
                break;
            case 2:
                try {
                    try {
                        a = application.masukkanNilaiMatriks2D(scanner);
                        application.tampilkanIsiMatriksKeConsole("X", a);
                        b = application.masukkanNilaiMatriks2D(scanner);
                        application.tampilkanIsiMatriksKeConsole("Y", b);
                        c = application.penguranganNilaiMatriks2DDenganOrdo2x2(a, b);
                        application.tampilkanIsiMatriksKeConsole("Z", c);
                    } catch (IOException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException e) {}
                break;
            default:
                throw new InputMismatchException();
        }
    }

    public int[][] masukkanNilaiMatriks2D(Scanner scanner) throws IOException, ArrayIndexOutOfBoundsException, InputMismatchException {
        int[][] a;
        a = new int[2][2];

        System.out.println("Masukkan nilai matriks X");
        System.out.println("========================");

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                System.out.println("[" + (firstIteration + 1) + "]" + "[" + (secondIteration + 1) + "]");
                a[firstIteration][secondIteration] = scanner.nextInt();
            }
        }
        return a;
    }

    public int[][] perkalianNilaiMatriks2DDenganOrdo2x2(int[][] a, int[][] b) throws IOException, ArrayIndexOutOfBoundsException, InputMismatchException {
        int[][] c;
        c = new int[2][2];

        for (int firstIteration = 0; firstIteration < a.length; firstIteration++) {
            for (int secondIteration = 0; secondIteration < b.length; secondIteration++) {
                c[firstIteration][secondIteration] = a[firstIteration][secondIteration] * b[secondIteration][firstIteration];
            }
        }
        return c;
    }

    public int[][] penguranganNilaiMatriks2DDenganOrdo2x2(int[][] a, int[][] b) throws IOException, ArrayIndexOutOfBoundsException, InputMismatchException {
        int[][] c;
        c = new int[2][2];

        for (int firstIteration = 0; firstIteration < a.length; firstIteration++) {
            for (int secondIteration = 0; secondIteration < b.length; secondIteration++) {
                c[firstIteration][secondIteration] = a[firstIteration][secondIteration] - b[firstIteration][secondIteration];
            }
        }
        return c;
    }

    public int tampilkanHalamanUtama(Scanner scanner) throws IOException, InputMismatchException{
        System.out.println("Program mengalikan matriks.");
        System.out.println("Pilih salah 1 menu:");
        System.out.println("\t" + "1. Perkalian Matriks");
        System.out.println("\t" + "2. Pengurangan Matriks");
        System.out.print("Pilih Menu:\t");
        int pilihanMenu = scanner.nextInt();
        System.out.println();

        return pilihanMenu;
    }

    public void tampilkanIsiMatriksKeConsole(String namaMatriks, int[][] a) throws IOException, ArrayIndexOutOfBoundsException, InputMismatchException {
        System.out.println("Isi Matriks " + namaMatriks);
        System.out.println("=========================");

        for (int firstIteration = 0; firstIteration < a.length; firstIteration++) {
            for (int secondIteration = 0; secondIteration < a.length; secondIteration++) {
                System.out.print("[" + a[firstIteration][secondIteration] + "]");
            }
            System.out.println(" ");
        }
    }
}
