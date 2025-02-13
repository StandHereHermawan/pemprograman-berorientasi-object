package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util;

import java.util.Scanner;

public class ConsoleUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
        System.out.print("\t\t" + info + " : ");
        return scanner.nextLine();
    }
}
