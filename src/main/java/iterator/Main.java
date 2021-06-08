package iterator;

public class Main {
    
    public static void main(String[] args) {
        Perfil joao = new Perfil("João da Silva");
        Perfil maria = new Perfil("Maria dos Santos");
        Perfil pedro = new Perfil("Pedro Gonçalves");
        Perfil julia = new Perfil("Julia Nascimento");
        Perfil luiz = new Perfil("Luiz de Lima");
        
        joao.addAmigo(luiz);
        luiz.addAmigo(julia);
        joao.addAmigo(pedro);
        
        IteratorDePerfis iterador = new FacebookIterator(joao);
        System.out.println("Percorrendo perfis relacionados à " + joao);
        
        while (iterador.hasNext()) {
            Perfil perfil = iterador.getNext();
            System.out.println(perfil);
        }
    }
    
}
