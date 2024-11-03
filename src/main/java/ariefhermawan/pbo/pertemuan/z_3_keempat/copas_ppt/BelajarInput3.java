package ariefhermawan.pbo.pertemuan.z_3_keempat.copas_ppt;

import javax.swing.JOptionPane;

public class BelajarInput3 {
    public static void main(String[] args) {
        String nama;
        nama = JOptionPane.showInputDialog("Masukkan Nama");
        String message = "Selamat" + " " + "Belajar" + " " + nama;
        JOptionPane.showMessageDialog(null, message);
    }
}
