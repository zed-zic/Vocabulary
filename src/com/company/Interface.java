package com.company;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    static final JTextArea sourceWord = new JTextArea(5,30);
    static final JTextArea trancslatedWord = new JTextArea(5,30);
    static final JButton translateBtn = new JButton("Translate");

    static JFrame getMainWindow(){
        JFrame window = getJFrame();

        JPanel jPanel = new JPanel();
        window.add(jPanel);
        jPanel.add(sourceWord);
        jPanel.add(translateBtn);
        jPanel.add(trancslatedWord);
        jPanel.revalidate();
        return window;
    }

    static JFrame getJFrame(){
        JFrame window = new JFrame("tic-tac-toe");
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        window.setBounds(dimension.width/2-250, dimension.height/2-150, 450, 450);
        return window;
    }
}
