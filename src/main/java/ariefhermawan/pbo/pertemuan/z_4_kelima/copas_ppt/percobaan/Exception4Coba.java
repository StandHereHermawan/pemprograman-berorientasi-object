package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.lang.Exception;

public class Exception4Coba {
    public static void main(String[] args) {
        int bil = 10;
        String[] b = {"a", "b", "c"};

        try {
            System.out.println(b[3]);
            System.out.println(bil/0);
        } catch (ArithmeticException exception) {
            System.out.println("Terjadi aritmatika error.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Melebihi indeks array.");
        } catch (Exception exception) {
            System.out.println("Ini menghandle error yang terjadi.");
        }

        try {
            System.out.println(bil/0);
            System.out.println(b[3]);
        } catch (ArithmeticException exception) {
            System.out.println("Terjadi aritmatika error.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Melebihi indeks array.");
        } catch (Exception exception) {
            System.out.println("Ini menghandle error yang terjadi.");
        }
    }
}
