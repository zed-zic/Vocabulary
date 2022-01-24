package com.company;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    static JLabel labelSourceWord = new JLabel("Enter your word:");
    static JLabel labelTranslatedWord = new JLabel("Translate:");
    static  JTextArea sourceWord = new JTextArea(5,30);
    static  JTextArea translatedWord = new JTextArea(5,30);
    static  JButton translateBtn = new JButton("Translate");
    static final Toolkit toolkit = Toolkit.getDefaultToolkit();
    static final Dimension dimension = toolkit.getScreenSize();
    final static int indent = 10;

    static JFrame getMainWindow(){



            JFrame window = getJFrame();

            Container container = window.getContentPane();
            container.setLayout(new GridLayout(5, 1, 2, 2));



        //JPanel jPanel = new JPanel();
        //window.add(jPanel);
        container.add(labelSourceWord);
        container.add(sourceWord);
        container.add(translateBtn);
        container.add(labelTranslatedWord);
        container.add(translatedWord);
        //jPanel.revalidate();
        return window;
    }

    static JFrame getJFrame(){
        JFrame window = new JFrame("tic-tac-toe");
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        window.setBounds(dimension.width/2-250, dimension.height/2-150, 450, 450);
        return window;
    }
}
