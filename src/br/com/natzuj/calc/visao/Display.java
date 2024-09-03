package br.com.natzuj.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.natzuj.calc.modelo.Memoria;
import br.com.natzuj.calc.modelo.MemoriaObserver;

public class Display extends JPanel implements MemoriaObserver{

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObserver(this);
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Courier New", Font.PLAIN, 30));
        
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
    
}
