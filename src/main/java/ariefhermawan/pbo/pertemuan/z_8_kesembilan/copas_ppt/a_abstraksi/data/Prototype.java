package ariefhermawan.pbo.pertemuan.z_8_kesembilan.copas_ppt.a_abstraksi.data;

abstract class Prototype {
    abstract public void methodDua();
    int x, y, z;

    public void methodSatu() {
        System.out.println("Method nyata dari class Prototype");
        System.out.println("Nilai x, y ditentukan dalam class Prototype.");
        x = 12;
        y = 10;
    }
}
