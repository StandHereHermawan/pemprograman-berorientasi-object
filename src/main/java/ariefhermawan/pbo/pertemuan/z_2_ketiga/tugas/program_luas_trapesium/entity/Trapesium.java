package ariefhermawan.pbo.pertemuan.z_2_ketiga.tugas.program_luas_trapesium.entity;

public class Trapesium {
    double alasSejajarA;
    double alasSejajarB;
    final double satuPerDua = 0.5;
    double tinggi;
    double luasTrapesium;

    public Trapesium(double alasSejajarA, double alasSejajarB, double tinggi) {
        this.alasSejajarA = alasSejajarA;
        this.alasSejajarB = alasSejajarB;
        this.tinggi = tinggi;
    }

    private double luasTrapesium() {
        double hasilPenjumlahanAlasSejajar = this.alasSejajarA + this.alasSejajarB;
        return this.luasTrapesium = this.satuPerDua * hasilPenjumlahanAlasSejajar * this.tinggi;
    }

    public void tampilkanKeTerminal() {
        System.out.println(
                "Trapesium " + this.newLine() + this.tab() +
                        "dengan alas sejajar a" + this.template(this.alasSejajarA) + this.tab() +
                        "dengan alas sejajar b" + this.template(this.alasSejajarB) + this.tab() +
                        "dengan tinggi" + this.doubleTab() + this.template(this.tinggi) + this.tab() +
                        "dengan luas" + this.tripleTab() + this.template(this.luasTrapesium()) + this.tab() +
                        "dengan rumus luas trapesium adalah 1/2 * ( A + B ) * t."
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

    private String tripleTab() {
        return this.tab() + this.tab() + this.tab();
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
