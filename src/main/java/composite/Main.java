package composite;

public class Main {
    public static void main(String[] args) {
        Produto cadeira = new Produto("Cadeira gamer", 1000);
        
        Caixa caixa1 = new Caixa(
            new Produto("Mouse", 50),
            new Produto("Teclado", 100),
            new Produto("Fone de ouvido", 300)
        );
        
        Produto pc = new Produto("PC", 3000);
        Caixa caixa2 = new Caixa(pc, caixa1);
        
        Caixa caixa3 = new Caixa(cadeira, caixa2);
        System.out.println(caixa3.getPreco());
    }
}
