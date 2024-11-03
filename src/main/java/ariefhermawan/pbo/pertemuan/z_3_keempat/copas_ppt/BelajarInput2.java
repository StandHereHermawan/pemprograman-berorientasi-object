package ariefhermawan.pbo.pertemuan.z_3_keempat.copas_ppt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelajarInput2 {
    public static void main(String[] args) {
        String nama;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Nama : ");

        try {
            nama = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
