package SimpleSwingApp;

import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My First Swing App");

        JButton jButton = new JButton("Click Me");

        JLabel jLabel = new JLabel("Hello, Pavan Mahesh ");

        jFrame.add(jButton);
        jFrame.add(jLabel);

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(400,300);

        jFrame.setVisible(true);
    }
}
