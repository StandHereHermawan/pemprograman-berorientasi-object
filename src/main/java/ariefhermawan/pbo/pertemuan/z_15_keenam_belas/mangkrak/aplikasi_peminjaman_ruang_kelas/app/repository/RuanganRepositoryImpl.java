package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.repository;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.entity.Ruangan;

import java.util.List;

public class RuanganRepositoryImpl implements RuanganRepository {

    @Override
    public List<Ruangan> findAllRuangan() {
        return List.of();
    }

    @Override
    public Ruangan findByRuanganIdentifier(String ruanganIdentifier) {
        return null;
    }
}
