package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.repository;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.entity.Ruangan;

public interface MahasiswaRepository {

    public Ruangan findByNomorIndukMahasiswa(String nomorIndukMahasiswa);
}
