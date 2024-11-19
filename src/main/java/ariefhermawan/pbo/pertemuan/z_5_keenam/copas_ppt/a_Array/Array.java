package ariefhermawan.pbo.pertemuan.z_5_keenam.copas_ppt.a_Array;

public class Array {
    public static void main(String[] args) {
        int[] java;
        java  = new int[5];
        int iteration;

        java[0] = 2;
        java[1] = 1;
        java[2] = 4;
        java[3] = 10;
        java[4] = 3;

        for (iteration = 0; iteration < java.length; iteration++) {
            System.err.println("\t"+"Java["+iteration+"] = "+ java[iteration]);
        }
    }
}
