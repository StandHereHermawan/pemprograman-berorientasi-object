package ariefhermawan.pbo.pertemuan.z_1_kedua.ngulik;

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

    public void systemOutConsole() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode()) +
                "Lagu{" +
                "judul=" + Arrays.toString(judul) +
                ", penyanyi=" + Arrays.toString(penyanyi) +
                ", durasi=" + durasi +
                '}';
    }
}

class Instansiasi {
    public static void main(String[] args) {
        Lagu lagu = new Lagu();
        lagu.judul = new char[]{
                'h', 'i', 'l', 'a', 'n', 'g', ' ',
                'h', 'a', 'r', 'a', 'p', 'a', 'n'
        };

        lagu.penyanyi = new char[]{
                's', 't', 'a', 'n', 'd', ' ',
                'h', 'e', 'r', 'e', ' ',
                'a', 'l', 'o', 'n', 'e'
        };

        lagu.durasi = 3;
        lagu.check_durasi(3);
        lagu.systemOutConsole();
    }
}