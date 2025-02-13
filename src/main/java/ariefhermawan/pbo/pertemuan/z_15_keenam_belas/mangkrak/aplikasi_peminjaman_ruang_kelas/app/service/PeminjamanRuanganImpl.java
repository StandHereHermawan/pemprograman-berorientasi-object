package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.service;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.repository.MahasiswaRepository;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.repository.RuanganRepository;

public class PeminjamanRuanganImpl implements PeminjamanRuangan {
    private MahasiswaRepository mahasiswaRepository;
    private RuanganRepository ruanganRepository;

    PeminjamanRuanganImpl(MahasiswaRepository mahasiswaRepositoryTemp, RuanganRepository ruanganRepositoryTemp) {
        this.setMahasiswaRepository(mahasiswaRepositoryTemp);
        this.setRuanganRepository(ruanganRepositoryTemp);
    }

    public MahasiswaRepository getMahasiswaRepository() {
        return mahasiswaRepository;
    }

    public void setMahasiswaRepository(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    public RuanganRepository getRuanganRepository() {
        return ruanganRepository;
    }

    public void setRuanganRepository(RuanganRepository ruanganRepository) {
        this.ruanganRepository = ruanganRepository;
    }

}
