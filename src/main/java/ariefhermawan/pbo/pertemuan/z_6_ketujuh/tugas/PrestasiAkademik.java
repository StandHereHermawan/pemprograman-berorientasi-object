package ariefhermawan.pbo.pertemuan.z_6_ketujuh.tugas;

public class PrestasiAkademik {
    private String nama;
    private String IndeksPrestasiSemester;
    private String IndeksPrestasiKumulatif; // mungkin bisa pake enum?
    private String riwayatBeasiswa; // mungkin bisa pake enum?

    PrestasiAkademik() {
        setAllFields(null, null, null, null);
    }

    PrestasiAkademik(String namaTemp, String ipss, String ipsk, String riwayatBeasiswa) {
        setAllFields(namaTemp, ipss, ipsk, riwayatBeasiswa);
    }

    public void setAllFields(String namaTemp, String ipss, String ipsk, String fakultasTemp) {
        this.setNama(namaTemp);
        this.setIndeksPrestasiSemester(ipss);
        this.setIndeksPrestasiKumulatif(ipsk);
        this.setRiwayatBeasiswa(fakultasTemp);
    }

    public void printAllFieldsToConsole() {
        System.out.println("\t" + "Nama" + "\t" + ":" + " " + this.getNama());
        System.out.println("\t" + "IPKS" + "\t" + ":" + " " + this.getIndeksPrestasiSemester());
        System.out.println("\t" + "IPKK" + "\t" + ":" + " " + this.getIndeksPrestasiKumulatif());
        System.out.println("\t" + "Riwayat Beasiswa" + "\t" + ":" + " " + this.getRiwayatBeasiswa());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIndeksPrestasiSemester() {
        return IndeksPrestasiSemester;
    }

    public void setIndeksPrestasiSemester(String indeksPrestasiSemester) {
        this.IndeksPrestasiSemester = indeksPrestasiSemester;
    }

    public String getIndeksPrestasiKumulatif() {
        return IndeksPrestasiKumulatif;
    }

    public void setIndeksPrestasiKumulatif(String indeksPrestasiKumulatif) {
        this.IndeksPrestasiKumulatif = indeksPrestasiKumulatif;
    }

    public String getRiwayatBeasiswa() {
        return riwayatBeasiswa;
    }

    public void setRiwayatBeasiswa(String riwayatBeasiswa) {
        this.riwayatBeasiswa = riwayatBeasiswa;
    }
}

class Main {
    public static void main(String[] args) {
        PrestasiAkademik identitasMahasiswa1 = new PrestasiAkademik(
                "Ujang",
                "123121018",
                "Sistem Informasi",
                "Teknologi dan Informatika"
        );

        identitasMahasiswa1.printAllFieldsToConsole();
    }
}