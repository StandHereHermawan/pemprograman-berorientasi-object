package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.z_2_finally_keyword;

public class A {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (Exception kesalahan) {
            System.err.println(kesalahan);
        } finally {
            System.out.println("Terima kasih telah menjalankan program.");
        }
    }
}