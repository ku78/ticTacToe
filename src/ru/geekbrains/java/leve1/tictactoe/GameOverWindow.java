package ru.geekbrains.java.leve1.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOverWindow extends JDialog {

    private JLabel jLabel = new JLabel();

    public GameOverWindow() {

        add(jLabel, BorderLayout.CENTER);
        JButton ok = new JButton("ОК");
        ok.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent event) {
                setVisible(false);
            }
        });

        // Кнопка ОК помещается в нижнюю часть окна.
        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);
        setSize(260, 160);
        setLocationRelativeTo ( null );

    }

    public void setMessage(String message, Map map) {
        map.gameOver = true;
        this.setVisible(true);
        jLabel.setText(message);
    }

}