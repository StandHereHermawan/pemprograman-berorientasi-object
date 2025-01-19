package ariefhermawan.pbo.pertemuan.z_8_kesembilan.copas_ppt.b_encapsulation.app;

import ariefhermawan.pbo.pertemuan.z_8_kesembilan.copas_ppt.b_encapsulation.data.Encapsulation;

public class BelajarEnkapsulasi {
    public static void main(String[] args) {
        Encapsulation objekEncapsulation = new Encapsulation();
        objekEncapsulation.modifNilaiNama("Arief Karditya Hermawan");
        objekEncapsulation.modifNilaiAddress("Jl. Lorem Ipsum No.15");
        objekEncapsulation.modifNilaiNomorIndukMahasiswa(123121033);
        objekEncapsulation.toConsole();
    }
}
