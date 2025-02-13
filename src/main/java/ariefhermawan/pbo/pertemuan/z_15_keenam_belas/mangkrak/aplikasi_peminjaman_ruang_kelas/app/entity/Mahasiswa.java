package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.entity;

public class Mahasiswa {
    private String nomorIndukMahasiswa;
    private String namaLengkapMahasiswa;
    private String identitasKelasMahasiswa;
    private int angkatanKelasMahasiswa;
    private String posisiJabatanMahasiswa;

    Mahasiswa() {
        this.setNomorIndukMahasiswa(null);
        this.setNamaLengkapMahasiswa(null);
        this.setIdentitasKelasMahasiswa(null);
        this.setAngkatanKelasMahasiswa(0);
        this.setPosisiJabatanMahasiswa(null);
    }

    Mahasiswa(
            String nomorIndukMahasiswa,
            String namaLengkapMahasiswa,
            String identitasKelasMahasiswa,
            int angkatanKelasMahasiswa,
            String posisiJabatanMahasiswa
    ) {
        this.setNomorIndukMahasiswa(nomorIndukMahasiswa);
        this.setNamaLengkapMahasiswa(namaLengkapMahasiswa);
        this.setIdentitasKelasMahasiswa(identitasKelasMahasiswa);
        this.setAngkatanKelasMahasiswa(angkatanKelasMahasiswa);
        this.setPosisiJabatanMahasiswa(posisiJabatanMahasiswa);
    }

    public void printToConsole() {
        System.out.println("\t" + "Nomor Induk Mahasiswa" + "\t" + ":" + " " + this.getNomorIndukMahasiswa());
        System.out.println("\t" + "Nama Lengkap Mahasiswa" + "\t" + ":" + " " + this.getNamaLengkapMahasiswa());
        System.out.println("\t" + "Identitas Kelas Mahasiswa" + "\t" + ":" + " " + this.getIdentitasKelasMahasiswa());
        System.out.println("\t" + "Angkatan Kelas Mahasiswa" + "\t" + ":" + " " + this.getAngkatanKelasMahasiswa());
        System.out.println("\t" + "Posisi Jabatan Mahasiswa" + "\t" + ":" + " " + this.getPosisiJabatanMahasiswa());
    }

    public String getNomorIndukMahasiswa() {
        return nomorIndukMahasiswa;
    }

    public void setNomorIndukMahasiswa(String nomorIndukMahasiswa) {
        this.nomorIndukMahasiswa = nomorIndukMahasiswa;
    }

    public String getNamaLengkapMahasiswa() {
        return namaLengkapMahasiswa;
    }

    public void setNamaLengkapMahasiswa(String namaLengkapMahasiswa) {
        this.namaLengkapMahasiswa = namaLengkapMahasiswa;
    }

    public String getIdentitasKelasMahasiswa() {
        return identitasKelasMahasiswa;
    }

    public void setIdentitasKelasMahasiswa(String identitasKelasMahasiswa) {
        this.identitasKelasMahasiswa = identitasKelasMahasiswa;
    }

    public int getAngkatanKelasMahasiswa() {
        return angkatanKelasMahasiswa;
    }

    public void setAngkatanKelasMahasiswa(int angkatanKelasMahasiswa) {
        this.angkatanKelasMahasiswa = angkatanKelasMahasiswa;
    }

    public String getPosisiJabatanMahasiswa() {
        return posisiJabatanMahasiswa;
    }

    public void setPosisiJabatanMahasiswa(String posisiJabatanMahasiswa) {
        this.posisiJabatanMahasiswa = posisiJabatanMahasiswa;
    }
}
