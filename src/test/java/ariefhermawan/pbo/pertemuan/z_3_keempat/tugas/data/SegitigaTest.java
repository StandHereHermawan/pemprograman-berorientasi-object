package ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegitigaTest {

    private Segitiga segitiga;

    @Test
    void testSegitigaExample() {
        this.segitiga = new Segitiga(4, 5);
        assertNotNull(this.segitiga);
    }

    @Test
    void testSegitigaViewKonsol() {
        this.segitiga = new Segitiga(5,4);
        assertNotNull(this.segitiga);
        this.segitiga.tampilkanPropertiesLingkaranKeKonsol();
    }

    @Test
    void testSegitigaViewJOption() {
        this.segitiga = new Segitiga(6,3);
        assertNotNull(this.segitiga);
        this.segitiga.tampilanHasilHitungBangunLingkaran();
    }
}