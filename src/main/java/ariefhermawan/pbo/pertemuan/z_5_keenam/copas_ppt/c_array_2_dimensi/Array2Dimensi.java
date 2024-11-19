package ariefhermawan.pbo.pertemuan.z_5_keenam.copas_ppt.c_array_2_dimensi;

import java.util.Scanner;

public class Array2Dimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        System.out.println("Masukkan nilai matriks X");
        System.out.println("========================");

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                System.out.println("[" + (firstIteration + 1) + "]" + "[" + (secondIteration + 1) + "]");
                a[firstIteration][secondIteration] = scanner.nextInt();
            }
        }

        System.out.println("Isi Matriks X");
        System.out.println("=========================");

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                System.out.print("[" + a[firstIteration][secondIteration] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("Masukkan nilai matriks Y");
        System.out.println("========================");

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                System.out.println("[" + (firstIteration + 1) + "]" + "[" + (secondIteration + 1) + "]");
                b[firstIteration][secondIteration] = scanner.nextInt();
            }
        }

        System.out.println("Isi Matriks Y");
        System.out.println("=========================");

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                System.out.print("[" + b[firstIteration][secondIteration] + "]");
            }
            System.out.println(" ");
        }

        /// Melakukan penjumlahan matriks.

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                c[firstIteration][secondIteration] = a[firstIteration][secondIteration] + b[firstIteration][secondIteration];
            }
        }

        System.out.println("Hasil Penjumlahan Matriks");
        System.out.println("=========================");

        for (int firstIteration = 0; firstIteration < 2; firstIteration++) {
            for (int secondIteration = 0; secondIteration < 2; secondIteration++) {
                System.out.print("[" + c[firstIteration][secondIteration] + "]");
            }
            System.out.println(" ");
        }
    }
}
