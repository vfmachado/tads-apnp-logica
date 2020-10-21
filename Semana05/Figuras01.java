import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras01 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        g.drawLine(0, 0, 400, 400); //desenha uma linha do ponto (0, 0) (superior esquerda) até o ponto (400, 400) (inferior direita)
        //g.drawLine(inicio, final);
                // x, y         x, y

        g.drawLine(0, 20, 400, 420);    //incremento de 20
        g.drawLine(0, 40, 400, 440);    //incremento

        for (int i = 0; i < 20; i++) {
            g.drawLine(0 + i * 20, i * 20, 400, i *20);
        }
    }


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras01 painel = new Figuras01();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
