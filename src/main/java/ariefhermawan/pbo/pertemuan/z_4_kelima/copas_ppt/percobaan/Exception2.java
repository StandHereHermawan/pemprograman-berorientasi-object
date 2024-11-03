package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String[] greeting = {
                "Hello World!",
                "No, I mean it!",
                "Hello word"
        };

        /// Kode Kurang Benar dalam konteks ini:
        ///
        /// <blockquote>
        /// <pre>
        ///
        /// while (i < 4) {
        ///     System.out.println(greeting[i]);
        ///     ++i;
        /// }
        ///
        /// </pre>
        /// </blockquote>

        /// Kode yang benar dalam konteks:
        try {
            while (i < 4) {
                System.out.println(greeting[i]);
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Resetting Index Value");
            i = 0;
        }
    }
}
