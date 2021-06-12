package solid.srp;

public class RegraVinteDoisEMeioPorcento implements RegraDeCalculo{

    @Override
    public double calcula(Funcionario2 funcionario) {
        return funcionario.getSalario() - (funcionario.getSalario() * 0.225);
    }

}
