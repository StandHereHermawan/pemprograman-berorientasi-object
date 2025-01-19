package ariefhermawan.pbo.pertemuan.z_7_kedelapan.uts.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class UTSArief {
    public static void main(String[] args) {
        ViewConsoleProgram viewConsoleProgram = new ViewConsoleProgram();
        Queue<IdentitasMahasiswaBesertaPrestasiUTS> queue = new ArrayDeque<>();

        {
            for (int i = 0; i < 5; i++) {
                int angka = i + 1;
                queue.add(new IdentitasMahasiswaBesertaPrestasiUTS(
                        new IdentitasMahasiswaUTS(
                                "Dummy-" + angka,
                                "123121" + angka,
                                "Sistem Informasi",
                                "FTI"
                        ),
                        new PrestasiAkademikUTS(
                                "Dummy " + angka,
                                "3.61",
                                "3.59",
                                "Belum Ada"
                        )
                ));
            }

            queue.add(new IdentitasMahasiswaBesertaPrestasiUTS(
                            new IdentitasMahasiswaUTS(
                                    "Arief Karditya Hermawan",
                                    "123121033",
                                    "Sistem Informasi",
                                    "FTI"
                            ),
                            new PrestasiAkademikUTS(
                                    "Arief Karditya Hermawan",
                                    "3.61",
                                    "3.59",
                                    "KIPK"
                            )
                    )
            );
        }


        Scanner scanner = new Scanner(System.in);
        boolean programBerulang = true;

        do {
            try {
                viewConsoleProgram.menuUtamaProgram();
                int pilihanMenuOlehUser = viewConsoleProgram.programDecision(scanner);

                if (pilihanMenuOlehUser == 1) {
                    IdentitasMahasiswaUTS identitasMahasiswaUTS = viewConsoleProgram.inputIdentitasMahasiswa(scanner);
                    identitasMahasiswaUTS.printAllFieldsToConsole();
                    PrestasiAkademikUTS prestasiAkademikUTS = viewConsoleProgram.inputPrestasiAkademik(scanner);
                    prestasiAkademikUTS.printAllFieldsToConsole();

                    queue.add(new IdentitasMahasiswaBesertaPrestasiUTS(
                            identitasMahasiswaUTS,
                            prestasiAkademikUTS
                    ));
                } else if (pilihanMenuOlehUser == 2) {
                    int angka = 1;
                    while (!queue.isEmpty()) {
                        IdentitasMahasiswaBesertaPrestasiUTS identitasMahasiswaBesertaPrestasiUTS1 = queue.poll();
                        identitasMahasiswaBesertaPrestasiUTS1.printAllFieldsToConsole();
                        System.out.println("\t" + "Nomor." + angka);
                        angka++;
                    }

                } else if (pilihanMenuOlehUser == 3) {
                    programBerulang = false;
                } else {
                    throw new PilihanTidakAdaException("Pilihan yang ada pilih, tidak ada.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } while (programBerulang);
    }
}


class PilihanTidakAdaException extends RuntimeException {
    PilihanTidakAdaException(String message) {
        super(message);
    }
}

class ViewConsoleProgram {
    public int programDecision(Scanner scanner) {
        System.out.print("\t" + "Perintah: ");
        String pilihanMenu = scanner.nextLine();
        System.out.println();

        int pilihanMenuOlehUser = Integer.parseInt(pilihanMenu);
        return pilihanMenuOlehUser;
    }

    public void menuUtamaProgram() {
        System.out.println();
        System.out.println("\t" + "====" + " " + "Program UTS Menambahkan Identitas Mahasiswa beserta Prestasi" + " " + "====");
        System.out.println("\t" + "Masukkan Pilihan Menu:");
        System.out.println("\t" + "1. Tambah Data Identitas dan Prestasi Mahasiswa");
        System.out.println("\t" + "2. Tampilkan Data");
        System.out.println("\t" + "3. Keluar Aplikasi");
    }

    public IdentitasMahasiswaUTS inputIdentitasMahasiswa(Scanner scanner) {
        System.out.println();
        System.out.println("\t" + "Identitas Mahasiswa");
        System.out.print("\t" + "Masukkan data nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.println();
        System.out.println("\t" + "Identitas Mahasiswa");
        System.out.print("\t" + "Masukkan data Nomor Induk Mahasiswa: ");
        String nomorIndukMahasiswa = scanner.nextLine();

        System.out.println();
        System.out.println("\t" + "Identitas Mahasiswa");
        System.out.print("\t" + "Masukkan data jurusan mahasiswa: ");
        String jurusanMahasiswa = scanner.nextLine();

        System.out.println();
        System.out.println("\t" + "Identitas Mahasiswa");
        System.out.print("\t" + "Masukkan data fakultas mahasiswa: ");
        String fakultasMahasiswa = scanner.nextLine();
        System.out.println();

        return new IdentitasMahasiswaUTS(namaMahasiswa, nomorIndukMahasiswa, jurusanMahasiswa, fakultasMahasiswa);
    }

    public PrestasiAkademikUTS inputPrestasiAkademik(Scanner scanner) {
        System.out.println();
        System.out.println("\t" + "Prestasi Akademik");
        System.out.print("\t" + "Masukkan data nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.println();
        System.out.println("\t" + "Prestasi Akademik");
        System.out.print("\t" + "Masukkan data indeks prestasi sementara mahasiswa: ");
        String indeksPrestasiSementara = scanner.nextLine();

        System.out.println();
        System.out.println("\t" + "Prestasi Akademik");
        System.out.print("\t" + "Masukkan data indeks prestasi kumulatif mahasiswa: ");
        String indeksPrestasiKumulatif = scanner.nextLine();

        System.out.println();
        System.out.println("\t" + "Prestasi Akademik");
        System.out.print("\t" + "Masukkan data riwayat beasiswa mahasiswa: ");
        String riwayat = scanner.nextLine();
        System.out.println();

        return new PrestasiAkademikUTS(namaMahasiswa, indeksPrestasiSementara, indeksPrestasiKumulatif, riwayat);
    }
}

class IdentitasMahasiswaBesertaPrestasiUTS {
    private PrestasiAkademikUTS prestasiAkademik;
    private IdentitasMahasiswaUTS identitasMahasiswa;

    IdentitasMahasiswaBesertaPrestasiUTS(
            IdentitasMahasiswaUTS identitasMahasiswa,
            PrestasiAkademikUTS prestasiAkademik
    ) {
        setIdentitasMahasiswa(identitasMahasiswa);
        setPrestasiAkademik(prestasiAkademik);
    }

    public void printAllFieldsToConsole() {
        this.getIdentitasMahasiswa().printAllFieldsToConsole();
        this.getPrestasiAkademik().printAllFieldsToConsole();
    }

    public PrestasiAkademikUTS getPrestasiAkademik() {
        return prestasiAkademik;
    }

    public void setPrestasiAkademik(PrestasiAkademikUTS prestasiAkademik) {
        this.prestasiAkademik = prestasiAkademik;
    }

    public IdentitasMahasiswaUTS getIdentitasMahasiswa() {
        return identitasMahasiswa;
    }

    public void setIdentitasMahasiswa(IdentitasMahasiswaUTS identitasMahasiswa) {
        this.identitasMahasiswa = identitasMahasiswa;
    }
}

class IdentitasMahasiswaUTS {
    // tipe data string kabeh gegara males nentuin tipe data aokwokakowokako
    private String nama;
    private String nomorIndukMahasiswa;
    private String jurusan; // mungkin bisa pake enum?
    private String fakultas; // mungkin bisa pake enum?

    IdentitasMahasiswaUTS(String namaTemp, String nimTemp, String jurusanTemp, String fakultasTemp) {
        setAllFields(namaTemp, nimTemp, jurusanTemp, fakultasTemp);
    }

    public void setAllFields(String namaTemp, String nimTemp, String jurusanTemp, String fakultasTemp) {
        this.setNama(namaTemp);
        this.setNomorIndukMahasiswa(nimTemp);
        this.setJurusan(jurusanTemp);
        this.setFakultas(fakultasTemp);
    }

    public void printAllFieldsToConsole() {
        System.out.println();
        System.out.println("\t" + "======" + "Identitas Mahasiswa" + "=======");
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

class PrestasiAkademikUTS {
    private String nama;
    private String IndeksPrestasiSemester;
    private String IndeksPrestasiKumulatif;
    private String riwayatBeasiswa;

    PrestasiAkademikUTS(String namaTemp, String ipss, String ipsk, String riwayatBeasiswa) {
        setAllFields(namaTemp, ipss, ipsk, riwayatBeasiswa);
    }

    public void printAllFieldsToConsole() {
        System.out.println();
        System.out.println("\t" + "======" + "Prestasi Akademik" + "=======");
        System.out.println("\t" + "Nama" + "\t" + ":" + " " + this.getNama());
        System.out.println("\t" + "IPKS" + "\t" + ":" + " " + this.getIndeksPrestasiSemester());
        System.out.println("\t" + "IPKK" + "\t" + ":" + " " + this.getIndeksPrestasiKumulatif());
        System.out.println("\t" + "Riwayat Beasiswa" + "\t" + ":" + " " + this.getRiwayatBeasiswa());
    }

    public void setAllFields(String namaTemp, String ipss, String ipsk, String fakultasTemp) {
        this.setNama(namaTemp);
        this.setIndeksPrestasiSemester(ipss);
        this.setIndeksPrestasiKumulatif(ipsk);
        this.setRiwayatBeasiswa(fakultasTemp);
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