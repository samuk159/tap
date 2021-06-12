package solid.srp;

public class RegraOnzePorcento implements RegraDeCalculo{

    @Override
    public double calcula(Funcionario2 funcionario) {
        return funcionario.getSalario() - (funcionario.getSalario() * 0.11);
    }

}
