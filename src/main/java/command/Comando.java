package command;

public abstract class Comando {
    public Editor editor;
    private String backup;

    Comando(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void desfazer() {
        editor.textField.setText(backup);
    }

    public abstract boolean executar();
}
