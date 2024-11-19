package ariefhermawan.pbo.pertemuan.z_5_keenam.copas_ppt.b_Rata_Rata_Array;

public class RataRataArray {
    public static void main(String[] args) {
        int[] javaKu;
        javaKu = new int[8];
        int iteration, arraySize;
        float total, average;

        arraySize = 8;
        total = 0;

        javaKu[0] = 3;
        javaKu[1] = 2;
        javaKu[2] = 8;
        javaKu[3] = 10;
        javaKu[4] = 14;
        javaKu[5] = 22;
        javaKu[6] = 0;
        javaKu[7] = 0;

        for (iteration = 0; iteration < arraySize; iteration++) {
            System.err.println("\t" + "Java[" + iteration + "] \t= " + javaKu[iteration]);
            /// total = total + javaKu[iteration];
            total += javaKu[iteration];
        }

        average = total / arraySize;
        System.out.println("\t"+"Total \t\t= " + total);
        System.out.println("\t"+"Rata-Rata \t= " + average);
    }
}
