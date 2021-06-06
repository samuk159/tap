package mediator;

public class Lista implements Componente {

    private Mediator mediator;
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNome() {
        return "Lista";
    }
    
    public void adicionaElemento(Nota nota) {
        System.out.println("Lista: adicionando elemento " + nota);
        //adiciona o elemento nota na lista
    }
    
    public void excluiElementoSelecionado() {
        System.out.println("Lista: excluíndo elemento selecionado");
        //implementação
    }
    
}
