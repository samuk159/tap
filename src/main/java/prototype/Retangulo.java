package prototype;

public class Retangulo extends Forma {
    public int largura;
    public int altura;
    
    public Retangulo() {}
    
    public Retangulo(Retangulo prototipo) {
        super(prototipo);
        if (prototipo != null) {
            this.largura = prototipo.largura;
            this.altura = prototipo.altura;
        }
    }

    @Override
    public Forma clonar() {
        return new Retangulo(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Retangulo) || !super.equals(object2)) return false;
        Retangulo forma2 = (Retangulo) object2;
        return forma2.largura == this.largura && forma2.altura == this.altura;
    }
}
