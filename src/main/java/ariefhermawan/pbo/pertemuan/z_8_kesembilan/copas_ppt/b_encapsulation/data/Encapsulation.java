package ariefhermawan.pbo.pertemuan.z_8_kesembilan.copas_ppt.b_encapsulation.data;

public class Encapsulation extends PrintConsole {
    private String nama;
    private String address;
    private int nomorIndukMahasiswa;

    @Override
    public void toConsole() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "nama='" + this.ambilNilaiNama() + '\'' +
                ", address='" + this.ambilNilaiAddress() + '\'' +
                ", nomorIndukMahasiswa=" + this.ambilNilaiNomorIndukMahasiswa() +
                '}';
    }

    public String ambilNilaiNama() {
        return this.nama;
    }

    public String ambilNilaiAddress() {
        return this.address;
    }

    public int ambilNilaiNomorIndukMahasiswa() {
        return this.nomorIndukMahasiswa;
    }

    public void modifNilaiNama(String nama) {
        this.nama = nama;
    }

    public void modifNilaiAddress(String address) {
        this.address = address;
    }

    public void modifNilaiNomorIndukMahasiswa(int nomorIndukMahasiswa) {
        this.nomorIndukMahasiswa = nomorIndukMahasiswa;
    }
}
