package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.experimental;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoMainMenuSwingDekstop {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("TodoExample");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(960, 540);
        jFrame.setLayout(null);

        JLabel menuUtama = new JLabel("Menu");
        menuUtama.setBounds(380, 110, 200, 40);
        jFrame.add(menuUtama);

        JLabel jLabelTambahTodo = new JLabel("1. Tambah Todo");
        jLabelTambahTodo.setBounds(380, 140, 200, 40);
        jFrame.add(jLabelTambahTodo);

        JLabel jLabelHapusTodo = new JLabel("2. Hapus Todo");
        jLabelHapusTodo.setBounds(380, 170, 200, 40);
        jFrame.add(jLabelHapusTodo);

        JLabel jLabelUbahTodo = new JLabel("3. Ubah Todo");
        jLabelUbahTodo.setBounds(380, 200, 200, 40);
        jFrame.add(jLabelUbahTodo);

        JLabel jLabel = new JLabel("Masukkan Todo");
        jLabel.setBounds(380, 230, 200, 40);
        jFrame.add(jLabel);

        JTextField masukkanTeksDisini = new JTextField("");
        masukkanTeksDisini.setBounds(380, 260, 300, 30);
        jFrame.add(masukkanTeksDisini);

        JButton button = new JButton("Klik Saya");
        button.setBounds(380, 310, 120, 30);
        jFrame.add(button);

        // Menambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jFrame.setVisible(true);
    }
}
