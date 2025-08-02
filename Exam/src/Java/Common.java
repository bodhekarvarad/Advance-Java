package Java;

import java.awt.event;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

import javax.swing.*;

public class Common extends JFrame {

    Common() {
        setVisible(true);
        setSize(500, 400);
        setLayout(new FlowLayout());
        JButton l = new JButton("HELLO WORLD");
        // l.setColor();
        add(l);
        JLabel l2 = new JLabel();
        add(l2);
        l.addActionListener(this);
    }

    public void actionPerformed(ActiveEvent ae) {
        // if (getSource == l) {
        l2.setText("Hi...");
        // }
    }

    public static void main(String args[]) {
        new Common();
    }
}