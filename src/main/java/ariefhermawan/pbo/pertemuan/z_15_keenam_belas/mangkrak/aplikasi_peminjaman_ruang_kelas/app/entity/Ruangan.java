package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.entity;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.mangkrak.aplikasi_peminjaman_ruang_kelas.app.entity.sub_classes_ruangan.FasilitasRuangan;

import java.util.List;

public class Ruangan {
    private String identitasRuangan;
    private String tipeRuangan;
    private int ukuranPanjangRuanganDalamMeter;
    private int ukuranLebarRuanganDalamMeter;
    private List<FasilitasRuangan> daftarFasilitasRuangan;
}
