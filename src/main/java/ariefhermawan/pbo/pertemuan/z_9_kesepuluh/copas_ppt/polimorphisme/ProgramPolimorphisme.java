package ariefhermawan.pbo.pertemuan.z_9_kesepuluh.copas_ppt.polimorphisme;

class BentukWajah {
    public String response() {
        return ("Perhatikan reaksi wajah saya.");
    }
}

class Tertawa extends BentukWajah {
    public String response() {
        return ("Tertawa karena gembira.");
    }
}

class Marah extends BentukWajah {
    public String response() {
        return ("Kemarahan disebabkan bertengkar.");
    }
}

class Sedih extends BentukWajah {
    public String response() {
        return ("Kesedihan karena dilanda malas belajar.");
    }
}

class Senyum extends BentukWajah {
    public String response() {
        return ("Senyum karena senang.");
    }
}

public class ProgramPolimorphisme {
    public static void main(String[] args) {
        BentukWajah objectBentukWajah = new BentukWajah();
        Senyum objectSenyum = new Senyum();
        Sedih objectSedih = new Sedih();
        Marah objectMarah = new Marah();
        Tertawa objectTertawa = new Tertawa();

        BentukWajah[] arrayOfObjectBentukWajah = new BentukWajah[5];
        arrayOfObjectBentukWajah[0] = objectBentukWajah;
        arrayOfObjectBentukWajah[1] = objectTertawa;
        arrayOfObjectBentukWajah[2] = objectMarah;
        arrayOfObjectBentukWajah[3] = objectSedih;
        arrayOfObjectBentukWajah[4] = objectSenyum;

        for (int i = 0; i < arrayOfObjectBentukWajah.length; i++) {
            System.out.println("BentukWajah[" + i + "]" + " " + arrayOfObjectBentukWajah[i].response());
        }
    }
}
