package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.lang.Exception;

public class Exception7ThrowExample2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here's my exception");
        } catch (Exception exception) {
            System.out.println("Caught exception");
            System.out.println("e.getMessage(): " + exception.getMessage());
            System.out.println("e.toString(): " + exception.toString());
            System.out.println("e.printStackTrace(): ");
            exception.printStackTrace();
        }
    }
}
