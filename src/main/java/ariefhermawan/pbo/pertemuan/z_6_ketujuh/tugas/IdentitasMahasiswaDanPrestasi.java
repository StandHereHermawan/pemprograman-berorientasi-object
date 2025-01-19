package ariefhermawan.pbo.pertemuan.z_6_ketujuh.tugas;

public class IdentitasMahasiswaDanPrestasi {
    private String nama;
    private String nomorIndukMahasiswa;
    private String jurusan;
    private String fakultas;
    private String IndeksPrestasiSemester;
    private String IndeksPrestasiKumulatif;
    private String riwayatBeasiswa;

    IdentitasMahasiswaDanPrestasi() {
        setAllFields(
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }

    IdentitasMahasiswaDanPrestasi(
            String namaTemp,
            String nimTemp,
            String jurusanTemp,
            String fakultasTemp,
            String ipsk,
            String ipss,
            String riwayatBeasiswa
    ) {
        setAllFields(namaTemp, nimTemp, jurusanTemp, fakultasTemp, ipss, ipsk, riwayatBeasiswa);
    }

    IdentitasMahasiswaDanPrestasi(
            IdentitasMahasiswa identitasMahasiswa,
            PrestasiAkademik prestasiAkademik
    ) {
        setFieldsInThisClassRelatedToIdentitasMahasiswa(identitasMahasiswa);
        setFieldsInThisClassRelatedToPrestasiAkademik(prestasiAkademik);
    }

    public void setAllFields(
            String namaTemp,
            String nimTemp,
            String jurusanTemp,
            String fakultasTemp,
            String ipss,
            String ipsk,
            String riwayatBeasiswa
    ) {
        this.setNama(namaTemp);
        this.setNomorIndukMahasiswa(nimTemp);
        this.setJurusan(jurusanTemp);
        this.setFakultas(fakultasTemp);
        this.setIndeksPrestasiSemester(ipss);
        this.setIndeksPrestasiKumulatif(ipsk);
        this.setRiwayatBeasiswa(riwayatBeasiswa);
    }

    public void setAllFields(
            IdentitasMahasiswa identitasMahasiswa,
            PrestasiAkademik prestasiAkademik
    ) {
        setFieldsInThisClassRelatedToIdentitasMahasiswa(identitasMahasiswa);
        setFieldsInThisClassRelatedToPrestasiAkademik(prestasiAkademik);
    }

    public void setFieldsInThisClassRelatedToIdentitasMahasiswa(IdentitasMahasiswa identitasMahasiswa) {
        this.setNama(identitasMahasiswa.getNama());
        this.setNomorIndukMahasiswa(identitasMahasiswa.getNomorIndukMahasiswa());
        this.setJurusan(identitasMahasiswa.getJurusan());
        this.setFakultas(identitasMahasiswa.getFakultas());
    }

    public void setFieldsInThisClassRelatedToPrestasiAkademik(PrestasiAkademik prestasiAkademik) {
        this.setNama(prestasiAkademik.getNama());
        this.setRiwayatBeasiswa(prestasiAkademik.getRiwayatBeasiswa());
        this.setIndeksPrestasiKumulatif(prestasiAkademik.getIndeksPrestasiKumulatif());
        this.setIndeksPrestasiSemester(prestasiAkademik.getIndeksPrestasiSemester());
    }

    public void printAllFieldsToConsole() {
        System.out.println("\t" + "Nama" + "\t" + ":" + " " + this.getNama());
        System.out.println("\t" + "NIM" + "\t" + ":" + " " + this.getNomorIndukMahasiswa());
        System.out.println("\t" + "Jurusan" + "\t" + ":" + " " + this.getJurusan());
        System.out.println("\t" + "Fakultas" + "\t" + ":" + " " + this.getFakultas());
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

    public String getNomorIndukMahasiswa() {
        return nomorIndukMahasiswa;
    }

    public void setNomorIndukMahasiswa(String nomorIndukMahasiswa) {
        this.nomorIndukMahasiswa = nomorIndukMahasiswa;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}

class MainIMP {
    public static void main(String[] args) {
        IdentitasMahasiswa identitasMahasiswa1 = new IdentitasMahasiswa(
                "Hilmi",
                "123121001",
                "Sistem Informasi",
                "Teknologi Informatika"
        );

        PrestasiAkademik prestasiAkademik1 = new PrestasiAkademik(
                identitasMahasiswa1.getNama(),
                "3.79",
                "3.9",
                "Belum Ada"
        );

        IdentitasMahasiswaDanPrestasi identitasMahasiswaDanPrestasi1 =
                new IdentitasMahasiswaDanPrestasi(identitasMahasiswa1, prestasiAkademik1);
        identitasMahasiswaDanPrestasi1.printAllFieldsToConsole();
    }
}