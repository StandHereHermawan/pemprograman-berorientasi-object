package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

public class Exception6ThrowExample {
    static void demo() {
        NullPointerException exception;
        exception = new NullPointerException("Coba Throw");
        throw exception;

        /// Baris ini tidak lagi dikerjakan.
        // System.out.println("Baris Yang tidak dikerjakan.");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai.");
        } catch (NullPointerException exception) {
            System.err.println("Ada pesan error: " + exception);
        }
    }
}
