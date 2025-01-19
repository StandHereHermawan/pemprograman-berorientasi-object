package ariefhermawan.pbo.pertemuan.z_9_kesepuluh.copas_ppt.pewarisan;

import java.util.Scanner;

public class ProgramPewarisan {
    public static void main(String[] args) {
        ClassA superClass = new ClassA();
        ClassB subClass = new ClassB();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Superclass adalah classA");
        superClass.x = 100;
        superClass.y = 125;
        superClass.tampilkanNilaiFieldXdanFieldY();

        System.out.println("Superclass adalah classB");
        subClass.y = 20;
        subClass.x = 13;
        subClass.tampilkanNilaiFieldXdanFieldY();

        System.out.print("Masukkan nilai z : ");
        subClass.z = inputScanner.nextInt();
        subClass.tampilkanJumlah();
    }
}

class ClassA {
    int x, y;

    void tampilkanNilaiFieldXdanFieldY() {
        System.out.println("Nilai x :" + this.x + " " + "Nilai y : " + this.y);
    }
}

class ClassB extends ClassA {
    int z;

    void tampilkanJumlah() {
        System.out.println("\n" + " " + "Jumlah nilai x + y + z = " + (super.x + super.y + this.z));
    }
}
