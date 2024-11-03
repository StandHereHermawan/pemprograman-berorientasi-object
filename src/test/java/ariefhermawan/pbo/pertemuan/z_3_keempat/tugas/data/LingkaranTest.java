package ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.*;

class LingkaranTest {

    private Lingkaran lingkaran;

    @Test
    void testLingkaran() {
        this.lingkaran = new Lingkaran(5);
        Assertions.assertNotNull(this.lingkaran);
        this.lingkaran.tampilkanPropertiesLingkaranKeKonsol();
    }

    @Test
    void testLingkaranNilai0() {
        this.lingkaran = new Lingkaran(0);
        Assertions.assertNotNull(this.lingkaran);
        this.lingkaran.tampilkanPropertiesLingkaranKeKonsol();
    }

    @Test
    void testViewJOption() {
        this.lingkaran = new Lingkaran(4);
        Assertions.assertNotNull(this.lingkaran);
        this.lingkaran.tampilanHasilHitungBangunLingkaran();
    }
}