package mediator;

public class Editor implements Mediator {
    
    private BotaoAdicionar add;
    private BotaoExcluir del;
    private BotaoSalvar save;
    private Lista lista;
    
    public void adicionarComponente(Componente componente) {
        System.out.println("Editor: Adicionando componente " + componente.getNome());
        componente.setMediator(this);
        
        switch (componente.getNome()) {
            case "BotaoAdicionar": 
                add = (BotaoAdicionar) componente;
                break;
            case "BotaoExcluir":
                del = (BotaoExcluir) componente;
                break;
            case "Lista": 
                lista = (Lista) componente;
                break;
            case "BotaoSalvar": 
                save = (BotaoSalvar) componente;
                break;            
        }
    }

    @Override
    public void adicionarNovaNota(Nota nota) {
        System.out.println("Editor: Adicionando nota " + nota);
        lista.adicionaElemento(nota);
    }

    @Override
    public void excluirNota() {
        System.out.println("Editor: Excluíndo nota selecionada");
        lista.excluiElementoSelecionado();
    }

    @Override
    public void salvar() {
        System.out.println("Editor: Salvando");
        //validar formulário e salvar
    }

    @Override
    public void desenharTela() {
        System.out.println("Editor: Renderizando");
        //renderiza os elementos na tela
    }
    
}
