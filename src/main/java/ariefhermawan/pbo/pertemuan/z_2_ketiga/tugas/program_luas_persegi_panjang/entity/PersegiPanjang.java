package ariefhermawan.pbo.pertemuan.z_2_ketiga.tugas.program_luas_persegi_panjang.entity;

public class PersegiPanjang {
    /**
     * <p>
     * Variabel "panjang, lebar dan luasPersegiPanjang" didalam class "PersegiPanjang"
     * ini biasa disebut properties atau field atau attribute. <br/><br/> Setiap
     * variabel yang nilainya adalah instansiasi objek dari class ini,
     * akan memiliki variabel "panjang" untuk diakses atau dimanipulasi
     * nilainya.
     * </p>
     */
    double panjang;
    double lebar;
    double luasPersegiPanjang;

    /**
     * <p>
     * Ini adalah konstruktor. konstruktor adalah fungsi atau method yang
     * dipanggil saat <b><i>"Instansiasi Object"</i></b> suatu class.
     * Contoh:
     * <blockquote>
     * <pre>
     * PersegiPanjang variabel = new PersegiPanjang();
     * </pre>
     * </blockquote>
     * jika terdapat fungsi atau method konstruktor pada block kode
     * class, maka fungsi tersebut akan dipanggil.
     * <p>
     * Bergantung pada baris kode yang berada didalam suatu class
     * apakah fungsi konstruktor terdapat parameter atau tidak.
     * Contoh:
     * <blockquote>
     * <pre>
     * PersegiPanjang variabel = new PersegiPanjang();
     * </pre>
     * </blockquote>
     * Instansiasi Object dari class "PersegiPanjang" tanpa parameter,
     * Maka, jika ada fungsi konstruktor tanpa parameter seperti:
     * <blockquote>
     * <pre>
     *     public PersegiPanjang() {
     *          this.panjang = 0;
     *          this.lebar = 0;
     *          this.luasPersegiPanjang = 0;
     *     }
     * </pre>
     * </blockquote>
     * Maka, fungsi konstruktor tanpa parameter yang ada di block class "PersegiPanjang"
     * tersebut akan di eksekusi.
     * </p>
     */
    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
        this.luasPersegiPanjang = 0;
    }

    /**
     * <p>
     * Ini adalah method konstruktor dengan parameter. Agar method
     * ini dipanggil, dibutuhkan menyisipkan variabel dengan tipe data sesuai.
     * Contoh kasus Konstruktor dengan parameter dibawah ini dipanggil:
     * </p>
     * <blockquote>
     * <pre>
     * PersegiPanjang persegiPanjang;
     * persegiPanjang = new PersegiPanjang(10, 20);
     * </pre>
     * </blockquote>
     */
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luasPersegiPanjang(this.panjang, this.lebar);
    }

    private double luasPersegiPanjang(double panjang, double lebar) {
        return this.luasPersegiPanjang = panjang * lebar;
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
                "Persegi panjang " + this.newLine() + this.tab() +
                        "dengan panjang" + this.template(this.panjang) + this.tab() +
                        "dengan lebar" + this.template(this.lebar) + this.tab() +
                        "dengan luas " + this.template(this.luasPersegiPanjang) + this.tab() +
                        "dengan rumus luas persegi panjang adalah panjang dikali lebar. ( P x L )"
        );
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
    private String template(Object panjang) {
        return this.tab() + this.colon() + this.whitespace() +
                panjang + this.newLine();
    }

    private String whitespace() {
        return " ";
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
