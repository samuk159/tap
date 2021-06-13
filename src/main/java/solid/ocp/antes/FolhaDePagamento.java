package solid.ocp.antes;

public class FolhaDePagamento {

    private float saldo;
    private int tipoContrato;
    
    public void calcular() {
        if (tipoContrato == 1) {
            this.saldo = calcularSalarioClt();
        } else if (tipoContrato == 2) {
            this.saldo = calcularBolsaEstagio();
        }
    }

    private float calcularSalarioClt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private float calcularBolsaEstagio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
