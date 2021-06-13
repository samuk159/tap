package solid.isp.depois;

public abstract class Funcionario implements Convencional {
	
    private String nome;
    private double salario;
    
    //getters e setters

    @Override
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
