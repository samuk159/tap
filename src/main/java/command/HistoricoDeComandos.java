package command;

import java.util.Stack;

public class HistoricoDeComandos {

    private Stack<Comando> historico = new Stack<>();

    public void push(Comando c) {
        historico.push(c);
    }

    public Comando pop() {
        return historico.pop();
    }

    public boolean isEmpty() { return historico.isEmpty(); }
    
}
