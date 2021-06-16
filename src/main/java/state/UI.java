package state;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {
    private Tocador tocador;
    private static JTextField textField = new JTextField();

    public UI(Tocador tocador) {
        this.tocador = tocador;
    }

    public void init() {
        JFrame frame = new JFrame("Tocador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(botoes);
        
        JButton tocar = new JButton("Tocar");
        tocar.addActionListener(e -> textField.setText(tocador.getEstado().tocar()));
        JButton parar = new JButton("Parar");
        parar.addActionListener(e -> textField.setText(tocador.getEstado().bloquear()));
        JButton proxima = new JButton("Próxima");
        proxima.addActionListener(e -> textField.setText(tocador.getEstado().proxima()));
        JButton anterior = new JButton("Anterior");
        anterior.addActionListener(e -> textField.setText(tocador.getEstado().anterior()));
        frame.setVisible(true);
        frame.setSize(400, 100);
        botoes.add(tocar);
        botoes.add(parar);
        botoes.add(proxima);
        botoes.add(anterior);
    }
}
