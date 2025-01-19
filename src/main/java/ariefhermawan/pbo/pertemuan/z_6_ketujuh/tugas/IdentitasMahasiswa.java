package ariefhermawan.pbo.pertemuan.z_6_ketujuh.tugas;

public class IdentitasMahasiswa {
    // tipe data string kabeh gegara skill isu ga bisa nentuin tipe data aokwokakowokako
    private String nama;
    private String nomorIndukMahasiswa;
    private String jurusan; // mungkin bisa pake enum?
    private String fakultas; // mungkin bisa pake enum?

    IdentitasMahasiswa() {
        setAllFields(null, null, null, null);
    }

    IdentitasMahasiswa(String namaTemp, String nimTemp, String jurusanTemp, String fakultasTemp) {
        setAllFields(namaTemp, nimTemp, jurusanTemp, fakultasTemp);
    }

    public void setAllFields(String namaTemp, String nimTemp, String jurusanTemp, String fakultasTemp) {
        this.setNama(namaTemp);
        this.setNomorIndukMahasiswa(nimTemp);
        this.setJurusan(jurusanTemp);
        this.setFakultas(fakultasTemp);
    }

    public void printAllFieldsToConsole() {
        System.out.println("\t" + "Nama" + "\t" + ":" + " " + this.getNama());
        System.out.println("\t" + "NIM" + "\t" + ":" + " " + this.getNomorIndukMahasiswa());
        System.out.println("\t" + "Jurusan" + "\t" + ":" + " " + this.getJurusan());
        System.out.println("\t" + "Fakultas" + "\t" + ":" + " " + this.getFakultas());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

class MainIdentitasMahasiswa {
    public static void main(String[] args) {
        IdentitasMahasiswa identitasMahasiswa1 = new IdentitasMahasiswa(
                "Ujang",
                "123121018",
                "Sistem Informasi",
                "Teknologi dan Informatika");

        identitasMahasiswa1.printAllFieldsToConsole();
    }
}