package prototype;

import java.util.Objects;

public abstract class Forma {
    int x, y;
    String cor;

    public Forma() {}
    
    public Forma(Forma prototipo) {
        if (prototipo != null) {
            this.x = prototipo.x;
            this.y = prototipo.y;
            this.cor = prototipo.cor;
        }
    }
    
    public abstract Forma clonar();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Forma)) return false;
        Forma forma2 = (Forma) object2;
        return forma2.x == x && forma2.y == y && Objects.equals(forma2.cor, this.cor);
    }
}
