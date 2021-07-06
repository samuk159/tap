package observer;

import java.io.File;

public interface Assinante {
    void atualizar(String tipoEvento, File arquivo);
}
