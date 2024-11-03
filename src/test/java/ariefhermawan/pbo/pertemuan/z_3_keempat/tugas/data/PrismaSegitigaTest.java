package ariefhermawan.pbo.pertemuan.z_3_keempat.tugas.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrismaSegitigaTest {

    private PrismaSegitiga prismaSegitiga;

    @BeforeEach
    void setUp() {
        this.prismaSegitiga = new PrismaSegitiga(4,5);
    }

    @Test
    void testPrismaExample() {
        assertNotNull(this.prismaSegitiga);
    }

    @Test
    void testPrismaViewConsole() {
        this.prismaSegitiga.tampilkanPropertiesPrismaKeKonsole();
    }

    @Test
    void testPrismaViewJOption() {
        this.prismaSegitiga.tampilkanPropertiesPrismaKeJOption();
    }
}