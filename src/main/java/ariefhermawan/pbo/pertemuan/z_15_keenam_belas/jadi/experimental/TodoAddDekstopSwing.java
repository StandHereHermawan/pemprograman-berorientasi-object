package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.experimental;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoAddDekstopSwing {

    public static void main(String[] args) {
        int verticalLayout = 30;

        JFrame jFrame = new JFrame("TodoExample");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(960, 540);
        jFrame.setLayout(null);

        int verticalLayout1 = verticalLayout + 40;
        JLabel jLabel = new JLabel("Masukkan Todo");
        jLabel.setBounds(380, verticalLayout1, 200, 40);
        jFrame.add(jLabel);

        int verticalLayout2 = verticalLayout1 + 40;
        JTextField masukkanTeksDisini = new JTextField("");
        masukkanTeksDisini.setBounds(380, verticalLayout2, 300, 30);
        jFrame.add(masukkanTeksDisini);

        int verticalLayout3 = verticalLayout2 + 40;
        JButton button = new JButton("Klik Saya");
        button.setBounds(380, verticalLayout3, 120, 30);
        jFrame.add(button);

        int verticalLayout4 = verticalLayout3 + 40;
        JLabel jLabel1 = new JLabel("");
        jLabel1.setBounds(380, verticalLayout4,200,40);

        // Menambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText(masukkanTeksDisini.getText());
            }
        });

        jFrame.add(jLabel1);
        jFrame.setVisible(true);
    }
}
