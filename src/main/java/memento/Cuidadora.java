package memento;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Cuidadora {
    private Formulario formulario;
    private Stack<Formulario.Snapshot> historico = new Stack<>();

    public Cuidadora(Formulario formulario) {
        this.formulario = formulario;
    }    
    
    public void salvarBackup() {
        historico.add(formulario.criarSnapshot());
    }
    
    public void desfazer() {
        if (!historico.isEmpty()) {
            historico.pop().restaurar();
        } else {
            JOptionPane.showMessageDialog(formulario, "Nenhum histórico armazenado");
        }
    }
    
}
