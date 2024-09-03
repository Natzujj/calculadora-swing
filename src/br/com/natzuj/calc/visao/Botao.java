package br.com.natzuj.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {
    
     public Botao(String text, Color color) {
        setText(text);
        setFont(new Font("courier", Font.PLAIN, 25));
        setOpaque(true);
        setBackground(color);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
     }
}
