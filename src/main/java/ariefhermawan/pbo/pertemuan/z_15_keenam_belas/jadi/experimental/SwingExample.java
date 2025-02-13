package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.experimental;

import javax.swing.*;
import java.awt.event.*;

public class SwingExample {

    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Contoh Swing");
        frame.setSize(1920, 1080); // Menentukan ukuran frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menutup aplikasi saat jendela ditutup

        // Membuat label
        JLabel label = new JLabel("Tekan tombol untuk mengubah teks");
        label.setBounds(860, 30, 400, 60);

        JTextField masukkanTeksDisini = new JTextField("Masukkan Teks disini");
        masukkanTeksDisini.setBounds(850,70,300,30);

        JLabel labelAgain = new JLabel("Tekan tombol untuk mengubah teks");
        labelAgain.setBounds(860, 110, 400, 60);

        JTextField masukkanTeksDisiniLagi = new JTextField("Masukkan Teks disini");
        masukkanTeksDisiniLagi.setBounds(850,150,300,30);

        // Membuat tombol
        JButton button = new JButton("Klik Saya");
        button.setBounds(930, 300, 120, 30);

        // Menambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol telah diklik!");
            }
        });

        // Mengatur layout dan menambahkan komponen ke frame
        frame.setLayout(null);
        frame.add(label);
        frame.add(masukkanTeksDisini);
        frame.add(labelAgain);
        frame.add(masukkanTeksDisiniLagi);
        frame.add(button);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
