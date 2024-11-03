package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.lang.Exception;

public class Exception5Coba {
    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil/0);
        } catch (ArithmeticException exception) {
            System.out.println("Pesan error: ");
            System.out.println(exception.getMessage());
            System.out.println("Info stack erase");
            exception.printStackTrace();
            exception.printStackTrace(System.out);
        } catch (Exception exception) {
            System.out.println("Ini menghandle error yang terjadi.");
        }
    }
}
