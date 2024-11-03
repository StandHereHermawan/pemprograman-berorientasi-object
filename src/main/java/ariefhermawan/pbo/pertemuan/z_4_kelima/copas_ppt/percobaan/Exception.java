package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

public class Exception {
    public static void main(String[] args) {
        /// Versi Program yang kurang tepat
        /// <blockquote>
        /// <pre>
        ///
        /// int[] a = new int[5];
        /// a[5] = 100;
        ///
        /// </pre>
        /// </blockquote>
        ///
        /// Versi Program yang tepat untuk kasus ini.
        int[] a = new int[5];

        try {
            a[5] = 100;
        }
        catch (java.lang.Exception exception) {
            System.err.println("Terjadi pelanggaran memory.");
        }
    }
}
