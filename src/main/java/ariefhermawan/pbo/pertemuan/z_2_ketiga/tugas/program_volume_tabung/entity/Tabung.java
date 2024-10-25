package ariefhermawan.pbo.pertemuan.z_2_ketiga.tugas.program_volume_tabung.entity;

public class Tabung {

    /**
     * <p>
     * Variabel "PI, jariJari dan luasTabung" didalam class "Tabung"
     * ini biasa disebut properties atau field atau attribute.
     * </p>
     *
     * <p>
     * Setiap variabel yang nilainya adalah instansiasi objek dari class ini,
     * akan memiliki variabel untuk diakses atau dimanipulasi
     * nilainya.
     * </p>
     *
     * <blockquote>
     * <pre>
     * Tabung tabung = new Tabung(10, 20);
     * System.out.println(tabung.jariJari);
     * System.out.println(tabung.tinggi);
     * System.out.println(tabung.luasTabung);
     * </pre>
     * </blockquote>
     *
     * <p>
     *     Hasilnya:
     * </p>
     *
     * <blockquote>
     * <pre>
     * Jari-Jari    : 5.0
     * Tinggi       : 3.0
     * Volume       : 235.6194490
     * </pre>
     * </blockquote>
     */
    final double PI = java.lang.Math.PI;
    double jariJari;
    double tinggi;
    double luasTabung;

    /**
     * <p>
     * Ini adalah method konstruktor dengan parameter. Agar method
     * ini dipanggil, dibutuhkan menyisipkan variabel dengan tipe data sesuai.
     * Contoh kasus Konstruktor dengan parameter dibawah ini dipanggil:
     * </p>
     * <blockquote>
     * <pre>
     * Tabung persegiPanjang;
     * persegiPanjang = new Tabung(10, 20);
     * </pre>
     * </blockquote>
     * <p>
     * Maka, Fungsi Konstruktor dibawah Akan dieksekusi.
     * </p>
     */
    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    /**
     * <p>
     * Ini adalah method atau function atau fungsi atau metode.
     * karena ini adalah bahasa pemprograman Java, maka saya akan
     * lebih menggunakan kata method daripada function.
     * <p/>
     *
     * <p>
     * karena method ini memiliki deklarasi tipe data setelah
     * deklarasi kata kunci pemberi akses, maka method dibawah
     * ini mengembalikan suatu data atau nilai yang dapat disimpan
     * dalam variabel dengan tipe data yang sama seperti yang telah
     * dideklarasikan di sebelum nama method atau sesudah pemberi akses.
     * <p/>
     */
    private double luasTabung() {
        double hasilKuadratJariJari = Math.pow(jariJari, 2);
        return this.luasTabung = this.PI * hasilKuadratJariJari * this.tinggi;
    }

    /**
     * <p>
     * ini adalah method atau function atau fungsi atau metode.
     * karena ini adalah bahasa pemprograman Java, maka saya akan
     * lebih menggunakan kata method daripada function.
     * </p>
     * <br/>
     * <p>
     * <b>Method</b> adalah suatu kata kunci yang mewakili suatu deklarasi
     * baris-baris kode. Bisa terdiri dari kode yang dideklarasi dan
     * kode-nya bawaan library kit dari Java-nya atau kode yang direkayasa
     * sendiri oleh pemilik program-nya.
     * </p>
     * <br/>
     * <p>
     * Bisa terdiri juga dari operasi manipulasi variabel. Tergantung kode
     * apa saja yang di deklarasikan oleh pembuat kode.
     * </p>
     * <br/>
     * <p>
     * karena method ini memiliki kata kunci void, maka method ini
     * hanya melakukan kode yang di deklarasi di baris kodenya. tidak
     * mengembalikan data apapun mau itu String, tipe data object lain-nya
     * atau tipe data primitif apapun.
     * <p/>
     */
    public void tampilkanKeTerminal() {
        System.out.println(
                "Tabung " + this.newLine() + this.tab() +
                        "dengan jari-jari" + this.tab() + this.template(this.jariJari) + this.tab() +
                        "dengan tinggi" + this.doubleTab() + this.template(this.tinggi) + this.tab() +
                        "dengan volume" + this.doubleTab() + this.template(this.luasTabung()) + this.tab() +
                        "dengan rumus luas trapesium adalah PI * R * R * T."
        );
    }

    private String template(Object panjang) {
        return this.tab() + this.colon() + this.whitespace() +
                panjang + this.newLine();
    }

    private String whitespace() {
        return " ";
    }

    private String doubleTab() {
        return this.tab() + this.tab();
    }

    private String tab() {
        return "\t";
    }

    private String colon() {
        return ":";
    }

    private String newLine() {
        return "\n";
    }
}
