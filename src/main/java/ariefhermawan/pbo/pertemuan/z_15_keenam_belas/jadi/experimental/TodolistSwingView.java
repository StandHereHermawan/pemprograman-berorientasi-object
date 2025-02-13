package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.experimental;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service.TodolistServiceAbstractClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodolistSwingView {

    private final TodolistServiceAbstractClass todolistServiceAbstractClass;

    public TodolistSwingView(TodolistServiceAbstractClass todolistServiceAbstractClass) {
        this.todolistServiceAbstractClass = todolistServiceAbstractClass;
    }

    public void showTodolist() {

    }

    public void addTodolist() {

        JFrame jFrame = new JFrame("TodoExample");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(960, 540);
        jFrame.setLayout(null);

        JLabel jLabel = new JLabel("Masukkan Todo");
        jLabel.setBounds(380, 30, 200, 40);
        jFrame.add(jLabel);

        JButton button = new JButton("Klik Saya");
        button.setBounds(380, 110, 120, 30);
        jFrame.add(button);

        JTextField masukkanTeksDisini = new JTextField("");
        masukkanTeksDisini.setBounds(380, 70, 300, 30);
        jFrame.add(masukkanTeksDisini);

        // Menambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public void removeTodolist() {

    }

    public void modifyTodolist() {

    }
}
