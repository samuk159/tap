package solid.srp;

public class Funcionario2 {
    
    private Integer id;
    private String nome;
    private double salario;
    private Cargo cargo;

    public Funcionario2() {}

    public Funcionario2(Integer id, String nome, double salario, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public double calculaSalario() {
        return cargo.getRegra().calcula(this);
    }
    
    //gtters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
    }
    
}
