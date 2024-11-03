package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.z_3_throw_keyword;

public class C {
    public static void main(String[] args) {
        try {
             new B();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

class B extends Exception {
    B() {

    }

    @Override
    public String toString() {
        return super.toString() + "Object dengan tipe data kelas B";
    }
}