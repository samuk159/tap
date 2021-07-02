package factory_method;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotaoDesktop implements Botao {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button;

    @Override
    public void renderizar() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);
        frame.getContentPane().add(panel);
        button = new JButton("Sair");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicado();
            }
        });
        panel.add(button);
        frame.setVisible(true);
    }

    @Override
    public void clicado() {
        System.out.println("Saindo");
        System.exit(0);
    }

}
