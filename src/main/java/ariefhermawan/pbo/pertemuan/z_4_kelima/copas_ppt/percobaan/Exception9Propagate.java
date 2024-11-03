package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.lang.Exception;

public class Exception9Propagate {

    public static String reverse(String param) throws Exception {

        if (param.length() == 0) {
            throw new Exception();
        }
        String reverseString = "";
        for (int i = param.length() - 1; i >= 0; --i) {
            reverseString += param.charAt(i);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        try {
            System.out.println(reverse("This is a String."));
        } catch (Exception exception) {
            System.out.println("The STring was blank.");
        } finally {
            System.out.println("All done.");
        }
    }
}
