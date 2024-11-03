package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.lang.Exception;

public class Exception3 {
    public static void main(String[] args) {
        int bil = 10;

        /// Program kurang tepat dalam konteks ini:
        /// <blockquote>
        /// <pre>
        /// System.out.println(bil/10);
        /// </pre>
        /// </blockquote>

        try {
            System.out.println(bil / 0);
        } catch (Exception exception) {
            System.out.println("Ini menghandle error yang terjadi.");
        }
    }
}
