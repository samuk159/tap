package command;

public class ComandoColar extends Comando {

    public ComandoColar(Editor editor) {
        super(editor);
    }

    @Override
    public boolean executar() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
