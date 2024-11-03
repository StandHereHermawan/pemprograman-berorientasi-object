package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.z_3_throw_keyword;

public class A {
    public static void main(String[] args) {
        try {
            throw new Exception("Class Exception di throw.");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}