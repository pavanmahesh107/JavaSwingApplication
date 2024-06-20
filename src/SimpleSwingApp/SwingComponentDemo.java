package SimpleSwingApp;

import javax.swing.*;
import java.awt.*;

public class SwingComponentDemo extends JFrame {

    public SwingComponentDemo() {
        super("Simple Component Demo");

        //Creating Panels to Organizing the components
        JPanel topPanel = new JPanel();
        JPanel centralPanel = new JPanel(new GridLayout(2, 2));
        JPanel bottomPanel = new JPanel();

        //Top Panel - Labels and Text Fields
        JLabel nameLabel = new JLabel("Name");
        JTextField nameTextField = new JTextField("20");
        topPanel.add(nameLabel);
        topPanel.add(nameTextField);


        //Central Panel - Buttons, Checkboxes, Radio Buttons
        JButton clickButton = new JButton("Click Me");
        JCheckBox checkBox = new JCheckBox("Option 1");
        JRadioButton radioButton = new JRadioButton("Radio 1");
        JRadioButton radioButton1 = new JRadioButton("Radio 2");

        ButtonGroup radioGroup = new ButtonGroup();

        radioGroup.add(radioButton);
        radioGroup.add(radioButton1);
        centralPanel.add(clickButton);
        centralPanel.add(checkBox);
        centralPanel.add(radioButton);
        centralPanel.add(radioButton1);

        //Bottom panel - Text area, List, and Scroll Pane
        JTextArea jTextArea = new JTextArea("5,20");
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        JList<String> list = new JList<>(listModel);
        bottomPanel.add(jScrollPane);
        bottomPanel.add(list);

        //Add a border to each panel
        topPanel.setBorder(BorderFactory.createTitledBorder("User Info"));
        centralPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Output"));


        //Adding Panels to Mainframe
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(centralPanel, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);


        //Pack and set windows properties
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
