package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.z_1_try_catch;

public class A {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            /// Berpotensi untuk menimbulkan kesalahan,
            /// yaitu pembagian dengan bilangan 0.
            System.out.println("Perintah selanjutnya: ");

        } catch (Exception kesalahan) {
            System.err.println(kesalahan);
        }
    }
}