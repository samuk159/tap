package command;

public class ComandoCopiar extends Comando {

    public ComandoCopiar(Editor editor) {
        super(editor);
    }

    @Override
    public boolean executar() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
