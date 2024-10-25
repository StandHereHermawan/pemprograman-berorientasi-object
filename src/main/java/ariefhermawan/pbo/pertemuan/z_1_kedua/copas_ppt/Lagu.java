package ariefhermawan.pbo.pertemuan.z_1_kedua.copas_ppt;

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