package command;

public class ComandoRecortar extends Comando {

    public ComandoRecortar(Editor editor) {
        super(editor);
    }

    @Override
    public boolean executar() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String fonte = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cortarString(fonte));
        return true;
    }
    
    private String cortarString(String fonte) {
        String inicio = fonte.substring(0, editor.textField.getSelectionStart());
        String fim = fonte.substring(editor.textField.getSelectionEnd());
        return inicio + fim;
    }
}
