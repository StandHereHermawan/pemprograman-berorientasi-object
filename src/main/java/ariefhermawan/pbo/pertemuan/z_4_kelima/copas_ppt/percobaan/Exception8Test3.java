package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.io.IOException;

public class Exception8Test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) {
        Exception8Test3 exception8Test3 = new Exception8Test3();
        /// Program kurang tepat
        ///
        /// <blockquote>
        /// <pre>
        ///
        /// exception8Test3.methodA();
        /// exception8Test3.methodB();
        ///
        /// </pre>
        /// </blockquote>
        ///
        exception8Test3.methodA();

        try {
            exception8Test3.methodB();
        } catch (IOException exception) {
            System.out.println("Error di method B.");
        } finally {
            System.out.println("Baris ini selalu dicetak.");
        }
    }
}
