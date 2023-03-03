package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    private JButton button = new JButton("OK");

    private JTextField input = new JTextField("", 2);
    private JLabel inputLabel = new JLabel("Input:");

    private JTextField output = new JTextField("", 2);
    private JLabel outputLabel = new JLabel("Output:");

    public MainFrame (){
        super("String");
        this.setBounds(200,200,400,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,3,5, 5));
        container.add(inputLabel);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        container.add(outputLabel);
        container.add(output);

    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String inputText = input.getText();
            StringBuilder outputText = new StringBuilder(inputText);
            int length = outputText.length();
            if (length % 2 == 0){
                length = length / 2 - 1;
            }
            else {
                length = length / 2;
            }
            outputText = new StringBuilder(outputText.substring(length));
            for (int i = 2; i < outputText.length(); i = i + 2) {
                outputText.deleteCharAt(i);
            }
            output.setText(outputText.toString());
        }
    }
}
