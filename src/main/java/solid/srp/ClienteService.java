package solid.srp;

import java.util.List;

public class ClienteService {

    public void enviarEmailParaClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            Registro registro = buscarClienteNoBancoDeDados();
            
            if (registro.isAtivo()) {
                enviarEmail(cliente);
            }
        }
    }

    private Registro buscarClienteNoBancoDeDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void enviarEmail(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Cliente {

        public Cliente() {
        }
    }

    private static class Registro {

        public Registro() {
        }

        private boolean isAtivo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
