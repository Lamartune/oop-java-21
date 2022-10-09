package ders09;

import ders01.form1;

import javax.swing.*;
import java.awt.*;

public class newform {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JTextPane textPane1;

    private void createUIComponents() {



        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    form1 frame = new form1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
