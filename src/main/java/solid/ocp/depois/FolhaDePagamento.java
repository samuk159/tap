package solid.ocp.depois;

public class FolhaDePagamento {
    private float saldo;
    
    public void calcular(Remuneravel funcionario) {
        this.saldo = funcionario.remuneracao();
    }    
}
