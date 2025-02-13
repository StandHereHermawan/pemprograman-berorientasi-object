package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.entity;

public class PenanggungJawabKelas {
    private String nomorIndukPegawai;
    private String namaLengkapPegawai;
    private int angkatanMasukKerjaPegawai;
    private String posisiJabatanPegawai;

    PenanggungJawabKelas() {
        this.setNomorIndukPegawai(null);
        this.setNamaLengkapPegawai(null);
        this.setAngkatanMasukKerjaPegawai(0);
        this.setPosisiJabatanPegawai(null);
    }

    PenanggungJawabKelas(
            String nomorIndukPegawai,
            String namaLengkapPegawai,
            int angkatanMasukPegawai,
            String posisiJabatanPegawai
    ) {
        this.setNomorIndukPegawai(nomorIndukPegawai);
        this.setNamaLengkapPegawai(namaLengkapPegawai);
        this.setAngkatanMasukKerjaPegawai(angkatanMasukPegawai);
        this.setPosisiJabatanPegawai(posisiJabatanPegawai);
    }

    public void printToConsole() {
        System.out.println("\t" + "Nomor Induk Pegawai" + "\t" + ":" + " " + this.getNomorIndukPegawai());
        System.out.println("\t" + "Nama Lengkap Pegawai" + "\t" + ":" + " " + this.getNamaLengkapPegawai());
        System.out.println("\t" + "Angkatan Masuk Kerja Pegawai" + "\t" + ":" + " " + this.getAngkatanMasukKerjaPegawai());
        System.out.println("\t" + "Posisi Jabatan Pegawai" + "\t" + ":" + " " + this.getPosisiJabatanPegawai());
    }

    public String getNomorIndukPegawai() {
        return nomorIndukPegawai;
    }

    public void setNomorIndukPegawai(String nomorIndukPegawai) {
        this.nomorIndukPegawai = nomorIndukPegawai;
    }

    public String getNamaLengkapPegawai() {
        return namaLengkapPegawai;
    }

    public void setNamaLengkapPegawai(String namaLengkapPegawai) {
        this.namaLengkapPegawai = namaLengkapPegawai;
    }

    public int getAngkatanMasukKerjaPegawai() {
        return angkatanMasukKerjaPegawai;
    }

    public void setAngkatanMasukKerjaPegawai(int angkatanMasukKerjaPegawai) {
        this.angkatanMasukKerjaPegawai = angkatanMasukKerjaPegawai;
    }

    public String getPosisiJabatanPegawai() {
        return posisiJabatanPegawai;
    }

    public void setPosisiJabatanPegawai(String posisiJabatanPegawai) {
        this.posisiJabatanPegawai = posisiJabatanPegawai;
    }
}
