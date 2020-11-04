import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras03 extends JPanel {
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        
        for (int i = 0; i < 400; i += 20) {
            g.drawLine(0, i, i, 400);    
            g.drawLine(0, i, 400 - i, 0);    
            g.drawLine(i, 0, 400, i);
            g.drawLine(i, 400, 400, 400 - i);
        }

    }


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras03 painel = new Figuras03();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
