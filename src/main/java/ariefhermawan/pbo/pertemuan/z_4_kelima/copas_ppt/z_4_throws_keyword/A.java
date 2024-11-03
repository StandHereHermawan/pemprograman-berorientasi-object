package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.z_4_throws_keyword;

public class A {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException {

    }
}