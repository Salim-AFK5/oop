package com.company;

        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;

public class MainFrame extends JFrame{
    private JButton button = new JButton("Превернуть");

    private JTextField input = new JTextField("", 5);
    private JLabel lable = new JLabel("Ваш текст: ");

    public MainFrame (){
        super("Переворачиватель текста");
        this.setBounds(100,200,350,80);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1,2,5, 5));
        container.add(lable);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String inputText = input.getText();
            StringBuilder outputText = new StringBuilder();
            for (int i = inputText.length() - 1; i >= 0; i--) {
                outputText.append(inputText.charAt(i));
            }
            input.setText(outputText.toString());
        }
    }
}