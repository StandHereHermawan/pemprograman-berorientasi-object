package ariefhermawan.pbo.pertemuan.kedua.copas_ppt;

import java.util.Arrays;

class Lagu {
    char[] judul;
    char[] penyanyi;
    int durasi;

    void check_durasi(int durasi) {
        if (durasi > 0) {
            System.out.println("Valid");
        }
    }
}